# EMPC API Documentation

## Introduction

Welcome to the **EMPC** documentation! This application is designed to help Employers to check any update every employee details and update any thing that is need and making sure that every important information is properly maintained. 

This documentation will guide you through the process of setting up, configuring, and using the application.

## Getting Started

Follow these steps to get your development environment set up.

### Prerequisites

Before you begin, ensure you have the following installed:

- **Java 17** or later
- **Maven**
- **MongoDB**
- **Docker** (optional, if you want to run the application in a containerized environment)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/empc.git
    cd empc
    ```

2. Install:

    ```bash
    mvn clean install
    ```

3. Install dependencies and build the project.

### Configuration

Before running the app, you may need to configure certain parameters. You can find these settings in the `application.properties` or `application.yml` file under the `src/main/resources` directory.

Common settings to configure:

- **Database configuration**:

    ```properties
    spring.data.mongodb.uri=mongodb+srv://<username>:<password>@freeapi.otpjiys.mongodb.net/collection?retryWrites=true&w=majority&appName=FreeApi
    ```

- **Server Port**:

    ```properties
    server.port=8080
    ```

## Running the Application

### Running Locally

You can run the application locally with the following command:

```bash
./mvnw spring-boot:run
```
