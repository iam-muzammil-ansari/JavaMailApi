# **JavaMailApi**

This project is a Java API that sends an email using the Spring Framework. It demonstrates the use of dependency injection and bean configuration in Spring.

## **Prerequisites**

- Java 8 or higher
- Maven
- SMTP email account (e.g., Gmail)

## **Getting Started**

1. Configure SMTP Email Account:

  - Open the `EmailService.java` file located in the `src/main/java/org/example` directory.
  - Replace the `SenderEmail` and `password` variables with your SMTP email credentials.
    Modify the `recieverEmail` variable to specify the recipient's email address.


2. Build the package:
   ```shell
      mvn clean package
   ```

3. Run the application:
   ```shell
      mvn spring-boot:run
   ```

4. Access the API:
  
   - Open your web browser/Postman and visit http://localhost:8080/api/objects.

   - The API will send an email with the details of Object A and Object B.

   - If Object B is null, the API will display the details on the web page instead.

## **Configuration**

   The project utilizes the following classes for configuration:

   - `Application.java`: Contains the main method to start the Spring Boot application.
   - `AppConfig.java`: Defines the beans and their dependencies using Java-based configuration.
    - `EmailService.java`: Represents the email service component responsible for sending emails.
    - `ObjectA.java`: Represents an object that depends on Object B.
    - `ObjectB.java`: Represents an object with an action.


## **Usage**

The API consists of a single endpoint:
  - `/api/objects`: GET request that retrieves the details of Object A and Object B.
    - If Object B is not null, an email is sent with the details.
    - If Object B is null, the details are displayed on the web page.

## **Contributing**
 
Contributions are welcome! If you find any issues or have suggestions, please open an issue or submit a pull request.

## **Git-Repo**

  my github repo -  [javaMailApi](https://github.com/ayaan097/JavaMailApi.git)
 

## **License**

This project is licensed under the MIT [License](license).
