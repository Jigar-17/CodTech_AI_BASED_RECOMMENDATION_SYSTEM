# CodTech_AI_BASED_RECOMMENDATION_SYSTEM
* COMPANY * : CODTECH IT SOLUTIONS
* NAME * : JIGAR DABHI
* INTERN ID * : CT04DK114
* DOMAIN * : JAVA PROGRAMMING
* MENTOR * : NEELA SANTOSH
### DESCRIPTION TASK-4 : AI BASED RECOMMENDATION SYSTEM
  This project is part of an internship task focused on building an **AI-based Recommendation System** using **Java** and **Apache Mahout**. The system suggests products, content, or services to users based on their preferences or past behavior. This is a type of **collaborative filtering** algorithm, which leverages user data to recommend similar items by analyzing patterns in the users' preferences.

The system uses **user-item interaction data** (like ratings, preferences, or interactions) to generate personalized recommendations for users. It implements a **User-Based Collaborative Filtering** approach, which suggests items liked by similar users.

---

## 🛠️ Technologies Used

- **Java**: The primary programming language used for implementing the recommendation system.
- **Apache Mahout**: A powerful machine learning library that provides algorithms for collaborative filtering, classification, and clustering.
- **SLF4J**: A simple logging facade for Java used to log important actions and errors.
- **Guava**: A set of core libraries developed by Google, used to simplify many aspects of the system (such as collections and caching).
- **CSV**: Used to store sample user-item preference data.

---

## 📂 Project Structure

AI-Recommendation/
├── RecommendationSystem.java # Main program file containing the logic for recommendations
├── mahout-core-0.9.jar # Mahout core library for machine learning algorithms
├── slf4j-api-1.7.5.jar # SLF4J logging library
├── guava-18.0.jar # Guava core libraries
├── preferences.csv # Sample data file containing user-item interaction data (ratings)
└── README.md # This file

## 📈 How It Works

The recommendation system follows these steps:
1. **Data Input**: User-item interaction data is loaded from a CSV file (`preferences.csv`). This data contains the preferences of users for various items (e.g., product ratings).
2. **Data Processing**: The system uses **Collaborative Filtering**, specifically **User-Based Collaborative Filtering**, to analyze the data. It identifies similar users based on shared preferences.
3. **Recommendation Generation**: For a given user, the system suggests items that other similar users have liked but the target user hasn't yet interacted with.
4. **Output**: The system outputs a list of recommended items for the user, based on preferences from other similar users.

### 📄 Sample CSV Format

The `preferences.csv` file contains data in the following format:

userID,itemID,preference
1,101,4.0
1,102,3.5
2,101,4.5
2,103,2.5

- **userID**: The ID of the user.
- **itemID**: The ID of the item (e.g., product, movie, song).
- **preference**: The preference score/rating given by the user for the item.

---

## 🚀 How to Run

### 1. Compile the Code

To compile the Java program with all the required dependencies, run the following command in your terminal:
javac -cp ".;mahout-core-0.9.jar;slf4j-api-1.7.5.jar;guava-18.0.jar" RecommendationSystem.java

2. Run the Program
After compilation, execute the program using the following command:

java -cp ".;mahout-core-0.9.jar;slf4j-api-1.7.5.jar;guava-18.0.jar" RecommendationSystem
⚠️ Note: You might see SLF4J warnings related to the logger configuration. These can be safely ignored if the program runs successfully.

✅ Output
Upon running the program, the system will output a list of recommended items for a user based on the preferences of similar users. For example:

Recommended items for User 1:
Item 102, Item 103
