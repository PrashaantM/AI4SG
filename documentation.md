# Project Documentation

## 1. Project Overview

### 1.1 Project Statement
- **Problem Statement**: Low-income immigrants in British Columbia often struggle to find affordable housing due to various barriers. These include language differences, limited access to relevant housing information, and challenges navigating the housing market. As a result, these individuals may experience lengthy searches, higher stress levels, and end up in housing options that do not align with their budget or needs.
- **Objectives**: The goal of this project is to create Housing Finder, an AI-powered platform designed to help low-income immigrants in British Columbia find affordable housing. The platform will feature an AI-driven recommendation engine that matches users with housing based on income levels, family size, and proximity to essential services (e.g., schools, healthcare, public transportation). Additionally, it will include a multilingual translation feature, enabling users to browse the interface and listings in their native language.
- **Target Audience**: The platform is specifically designed for low-income immigrants in British Columbia, who may face language barriers and lack sufficient access to affordable housing resources.

### 1.2 Proposed Solution
- **Solution Overview**: Housing Finder will be a web-based platform equipped with an AI recommendation engine that helps low-income immigrants find affordable housing. The platform will feature multilingual support and a user-friendly interface, offering easy navigation and personalized housing recommendations. By integrating AI and multilingual capabilities, the platform aims to reduce the stress and complexity of finding suitable housing for immigrants who may otherwise face significant barriers.
- **Key Features**:
   AI-Driven Recommendation Engine:
Matches users with housing options based on various factors like income, family size, and proximity to essential services (schools, healthcare, public transportation).

Multilingual Translation:
The platform will support multiple languages, allowing users to search for housing and navigate the platform in their preferred language through the integration of a translation API.

Personalized User Profiles:
Stores user preferences such as income, family size, and language to tailor housing search results accordingly.

Search & Filter Functionality:
Users can filter housing options based on criteria like price, location, family size, and availability of essential services.

Real-Time Listings:
The platform will regularly update housing listings to reflect real-time availability and pricing.

- **Expected Impact**:
Improved Access: Immigrants will have easier access to affordable housing, reducing the time and effort spent on searches.
Empowerment: By overcoming language barriers and providing personalized recommendations, the platform empowers users to make informed decisions.
Stress Reduction: Simplifying the housing search process through automation and tailored results will reduce the stress associated with finding housing.
Community Integration: The platform helps immigrants find housing near essential services, promoting smoother integration into local communities.

### 1.3 Technical Aspects
- **Programming Languages**: 
Front-End:
Framework: Vue.js
UI/UX Design: The user interface will be designed for ease of use, displaying key features like housing listings, language options, and search results in an intuitive format.
Back-End:
Framework: Java with Spring Boot
Core Features:
User Profile Class: This class will store user-specific information, such as income level, family size, language preference, and saved housing searches.
Search & Filter Class: This class will manage the logic for filtering housing options based on user-defined parameters like income, location, and family size.
Language Translation Class: This will handle the translation functionality, allowing users to input search queries and view results in their preferred language.

- **Frameworks and Libraries**:
  Multilingual Translation Feature (Key Component):
API: Integration with the DeepL API for multilingual support.
Process:
Users can input search queries in their native language.
The DeepL API will translate these queries into English for backend processing.
The AI-driven recommendation engine will search for housing options in English.
The search results will be translated back into the user's language using the DeepL API.
Users will see the final results in their preferred language, maintaining clarity and accessibility.
Full-Stack Integration:
The Spring Boot framework will serve as the bridge between the front-end (Vue.js) and back-end (Java). It will ensure smooth data flow between the user interface, the AI-driven recommendation engine, and the multilingual translation services.


## 2. Documentation of AI Tools Used

### 2.1 Overview of AI Tools
- **Tool Name**: List each AI tool used (e.g., ChatGPT, CodeWhisperer).
- **Purpose**: Describe the purpose of each tool in the context of the project.

### 2.2 Application of AI Tools
- **When Applied**: Specify when each tool was applied during the project phases (e.g., brainstorming, developing).
- **How Applied**: Detail the methods or processes through which the AI tool was utilized.
- **Rationale**: Explain why each tool was selected for its specific application.

### 2.3 Total use of AI Tools
- **Participan 1-- %usage**: Detail the percentage of AI tool usage by the participant across different project phases, such as brainstorming, development, documentation, and testing. Specify which tools were used most frequently.
- **Participan 2-- %usage**: Detail the percentage of AI tool usage by the participant across different project phases, such as brainstorming, development, documentation, and testing. Specify which tools were used most frequently.
- **Participan 3-- %usage**: Detail the percentage of AI tool usage by the participant across different project phases, such as brainstorming, development, documentation, and testing. Specify which tools were used most frequently.
- **Participan 4-- %usage**: Detail the percentage of AI tool usage by the participant across different project phases, such as brainstorming, development, documentation, and testing. Specify which tools were used most frequently.
- **Participan 5-- %usage**: Detail the percentage of AI tool usage by the participant across different project phases, such as brainstorming, development, documentation, and testing. Specify which tools were used most frequently.
