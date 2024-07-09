# IOOP Lab 10 

This repository contains the implementation of a lab using the Gson library for JSON serialization, deserialization, and making API calls. The lab is divided into three main tasks:

1. JSON Serialization
2. JSON Deserialization
3. API Call

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Tasks](#tasks)
  - [Task 1: JSON Serialization](#task-1-json-serialization)
  - [Task 2: JSON Deserialization](#task-2-json-deserialization)
  - [Task 3: API Call](#task-3-api-call)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle for dependency management

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/gson-lab.git
    ```
2. Navigate to the project directory:
    ```sh
    cd gson-lab
    ```
3. Add Gson dependency to your `pom.xml` (for Maven) or `build.gradle` (for Gradle):

    For Maven:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.8</version>
    </dependency>
    ```

    For Gradle:
    ```gradle
    implementation 'com.google.code.gson:gson:2.8.8'
    ```

## Tasks

### Task 1: JSON Serialization

1. Create a `CastMember` class with `actorName` and `characterName` properties.
2. Create a `Movie` class with `title`, `directorName`, `duration`, and `cast` properties.
3. In the `Main` class, create a list of at least two movies, each with at least two cast members.
4. Convert the list of movies into JSON with pretty printing enabled.
5. Print the result of the serialization to the console.

### Task 2: JSON Deserialization

1. Define `Student` and `Course` classes to represent the structure of the `students.json` file.
2. Read the `students.json` file and convert its content into a list of `Student` objects.
3. Calculate and print the average grade from all courses for each student.
4. Find and print the student with the highest average grade.

### Task 3: API Call

1. Create a `JokeApiClient` class with a method `jokeApiRequest` that sends a GET request to a joke API and returns the body of the response.
2. Define a `Joke` class that represents the structure of the joke API’s response.
3. In a testing method, call the `jokeApiRequest` method, convert the result into a `Joke` object, and print the object to the console.

## Usage

1. Ensure all dependencies are installed.
2. Compile the project using your IDE or command line.
3. Run the `Main` class to see the output of the serialization and deserialization tasks.
4. The API call task can be tested by running the respective method in the `JokeApiClient` class.

