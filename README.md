# java-cdi-weld

This project demonstrates the use of Contexts and Dependency Injection (CDI) with Weld in a Java application.

## Features
- Dependency Injection with CDI
- Weld as the CDI implementation
- Example usage of scopes and producers

## Requirements
- Java 17
- Maven 3+

## Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/java-cdi-weld.git
    cd java-cdi-weld
    ```

2. Build the project:
    ```bash
    mvn clean
    ```

3. Add the following VM options while running the application:
    ```
    --add-opens java.base/java.lang=ALL-UNNAMED
    --add-opens java.base/java.lang.invoke=ALL-UNNAMED
    --add-opens java.base/java.lang.reflect=ALL-UNNAMED
    ```

4. Run the application:
    ```bash
    java -jar java-cdi-weld-1.0.jar
    ```