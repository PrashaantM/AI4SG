

<template>
    <div id="app">
      <!-- Language Selection -->
      <div class="language-selector">
        <label for="language">Select Language: </label>
        <select v-model="selectedLanguage" @change="changeLanguage">
          <option value="en">English</option>
          <option value="fr">French</option>
          <option value="es">Spanish</option>
          <!-- More languages can be added here -->
        </select>
      </div>
  
      <!-- Search Bar -->
      <div class="search-container">
        <input type="number" v-model="budget" placeholder="Enter Budget" />
        <input type="text" v-model="location" placeholder="Enter Location (City)" />
        <button class="btn" @click="searchHousing">Search</button>
      </div>
  
      <!-- Loading Spinner -->
      <div class="loading-spinner" v-if="loading">
        <i class="fas fa-spinner fa-spin"></i> Loading...
      </div>
  
      <!-- Results Section -->
      <div v-if="!loading && resultsReceived">
        <!-- Exact Matches -->
        <div class="housing-list" v-if="exactMatches.length">
          <h3>Housing Links (Matches your search):</h3>
          <ul>
            <li v-for="link in exactMatches" :key="link">
              <a :href="link" target="_blank">{{ link }}</a>
            </li>
          </ul>
        </div>
  
        <!-- Recommended Matches -->
        <div class="housing-list" v-if="recommendedMatches.length">
          <h3>Recommended Housing Links (Close matches):</h3>
          <ul>
            <li v-for="link in recommendedMatches" :key="link">
              <a :href="link" target="_blank">{{ link }}</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        selectedLanguage: 'en',  // Default language
        budget: '',              // User's budget input
        location: '',            // User's location input
        loading: false,          // Loading spinner state
        exactMatches: [],        // Array for exact matches from backend
        recommendedMatches: [],  // Array for recommended matches
        resultsReceived: false   // Flag to check if results are received
      };
    },
    methods: {
      changeLanguage() {
        // Mock translation - you can replace this with a real translation API call
        alert(`Language changed to: ${this.selectedLanguage}`);
      },
      searchHousing() {
        // Clear previous results
        this.exactMatches = [];
        this.recommendedMatches = [];
        this.resultsReceived = false;
        this.loading = true;
  
        // Simulate sending data to backend (using a timeout to mimic an API call)
        const postData = {
          budget: this.budget,
          location: this.location,
          language: this.selectedLanguage
        };
        console.log("Sending data to backend:", postData);
  
        // Simulating a backend response with a timeout (replace this with an actual API call)
        setTimeout(() => {
          // Simulate response from backend
          const response = {
            exactMatches: [
              'https://kijiji.ca/housing1',
              'https://facebook.com/housing2'
            ],
            recommendedMatches: [
              'https://example.com/housing3',
              'https://example.com/housing4'
            ]
          };
  
          // Update data with response
          this.exactMatches = response.exactMatches;
          this.recommendedMatches = response.recommendedMatches;
          this.resultsReceived = true;
          this.loading = false;
        }, 2000);  // Simulating a 2-second backend delay
      }
    }
  };
  </script>
  
  <style scoped>
  body {
    font-family: Arial, sans-serif;
  }
  
  #app {
    width: 80%;
    margin: auto;
    padding-top: 20px;
  }
  
  .search-container,
  .language-selector {
    margin-bottom: 20px;
  }
  
  .search-container input {
    margin-right: 10px;
    padding: 5px;
  }
  
  .btn {
    padding: 10px 20px;
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
  }
  
  .btn:hover {
    background-color: #45a049;
  }
  
  .loading-spinner {
    display: none;
    font-size: 24px;
  }
  
  .housing-list {
    margin-top: 20px;
  }
  
  .housing-list a {
    display: block;
    margin-bottom: 5px;
    color: #007BFF;
  }
  
  .housing-list a:hover {
    text-decoration: underline;
  }
  </style>
  