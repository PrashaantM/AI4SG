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
- **Tool Name**: ChatGPT
- **Purpose**: ChatGPT was employed to assist with multiple aspects of the Housing Finder project, including brainstorming ideas, refining problem statements, developing technical documentation, and providing suggestions for the design of the AI recommendation engine and language translation functionality. ChatGPT's natural language processing capabilities were also used to generate content for project documentation, clarify technical challenges, and propose solutions to optimize various features.

### 2.2 Application of AI Tools
- **When Applied**: Brainstorming:
During the initial phases of the project, ChatGPT was used to generate ideas and refine the problem statement and objectives. It helped structure the project by identifying the target audience, key features, and outlining technical requirements.
Developing:
ChatGPT provided suggestions for designing the AI recommendation engine and multilingual translation feature. It contributed by offering ideas for how to integrate tools like the DeepL API, and recommended using Java with Spring Boot for backend development.
Documentation:
Throughout the documentation process, ChatGPT assisted in drafting and organizing content. This included writing descriptions for project features, overviews, and technical specifications.
Testing & Refinement:
In the testing phase, ChatGPT was consulted to troubleshoot challenges in the integration of the AI-driven recommendation engine and the translation feature. It provided insights into debugging and optimizing the algorithm to ensure better performance and user experience.
- **How Applied**: Brainstorming Phase:
ChatGPT facilitated the ideation process by generating a wide range of possible solutions for the problem statement. It also helped structure the flow of the project by suggesting a logical breakdown of the problem and identifying key deliverables.
Development Phase:
For the recommendation engine, ChatGPT provided guidance on data models for storing user profiles and suggested algorithms for matching users with housing options based on input parameters.
For the multilingual feature, it offered advice on the integration of APIs like DeepL for translation and gave suggestions on how to handle input/output translation processes efficiently.
Documentation Phase:
ChatGPT contributed to writing clear, concise, and organized documentation for each phase of the project. It provided templates and examples that helped streamline the process.
Testing & Optimization Phase:
ChatGPT provided debugging strategies and suggestions on how to improve performance when the system encountered challenges in processing search requests or when translations were not accurate.
- **Rationale**:Efficiency:
ChatGPT’s ability to quickly generate content and provide technical suggestions was crucial for saving time during the brainstorming and development phases. Its natural language processing capabilities allowed team members to refine their ideas and documentation in a more structured way.
Expertise:
ChatGPT’s knowledge base on various programming frameworks, AI algorithms, and API integrations made it an ideal tool for guiding development and troubleshooting technical challenges.
Clarity and Structure:
The tool’s ability to organize and present information clearly ensured that the documentation was well-structured, making it easier for all team members to collaborate effectively.

### 2.3 Total use of AI Tools
- **Participan 1-- %usage**: Brainstorming: 35%
Development: 20%
Documentation: 40%
Testing: 5%
Most Frequently Used Tool: ChatGPT (primarily for structuring documentation and brainstorming ideas).
- **Participan 2-- %usage**: Brainstorming: 25%
Development: 45%
Documentation: 20%
Testing: 10%
Most Frequently Used Tool: ChatGPT (especially during development for AI model suggestions and testing phase).
- **Participan 3-- %usage**: Brainstorming: 15%
Development: 50%
Documentation: 25%
Testing: 10%
Most Frequently Used Tool: ChatGPT (predominantly for technical development assistance and debugging).
- **Participan 4-- %usage**: Brainstorming: 30%
Development: 25%
Documentation: 35%
Testing: 10%
Most Frequently Used Tool: ChatGPT (for helping with design and development, as well as writing technical documentation).

