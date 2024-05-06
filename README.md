# Assistant Management Backend

This is a backend application for managing assistants. It provides CRUD (Create, Read, Update, Delete) APIs for managing assistant records.

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL Database Server
- Postman (for testing APIs)

## Running the Application

Follow these steps to run the application locally:

1. Clone this repository to your local machine:
https://github.com/gargigundawar/Internship-Hirademy-Backend.git


2. Navigate to the project directory:
cd Assistants


3. Open the `application.properties` file in the `src/main/resources` directory and configure the database connection properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/Assistants
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
server.port = 2231

Replace Assistants, root, and root with your MySQL database name, username, and password, respectively.


4. Build the project using Maven:
mvn clean install


5. Run the application:
This will start the Spring Boot application on port 2231 (configured in application.properties).


Using the Postman Collection
A Postman collection containing requests for testing the implemented API endpoints is included in this repository. Follow these steps to test the APIs using Postman:

Import the Postman collection JSON file (Assistants_API.postman_collection.json) into your Postman application.
Start your Spring Boot application as described in the previous section.
Use the imported Postman collection to send requests to the following API endpoints:
POST /assistant: Create a new assistant record.
GET /assistant/{assistantId}: Retrieve the details of a specific assistant.
PUT /assistant/{assistantId}: Update the details of a specific assistant.
DELETE /assistant/{assistantId}: Delete a specific assistant record.
Replace {assistantId} with the ID of the assistant you want to interact with.


Additional Information
For more information about the application or assistance with setting up and running it, please contact [gargigundawar1331@gmail.com].
