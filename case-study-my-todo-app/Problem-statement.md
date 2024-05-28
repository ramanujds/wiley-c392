
# Todo App with User Authentication

### Problem Statement:

You are required to develop a Todo application with user authentication using Spring Boot and MySQL. The application should allow users to register, log in, and manage their tasks. Users should be able to perform CRUD operations on tasks, including creating, reading, updating, and deleting tasks. The application should also provide REST API endpoints for user authentication, such as login and registration.


### Details:

1. **Spring Boot Project Initialization**: Initialize a Spring Boot project using Spring Initializr with dependencies including JPA, Spring Data JPA, and Web.

2. **Database Configuration**: Configure a MySQL database connection in the `application.properties` file. Define the necessary properties such as `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password`.

3. **JPA Entity - Task**: Create a JPA entity `Task` with attributes `id`, `title`, `description`, and `completed` in the `model` package.

4. **JPA Repository for Task**: Create a JPA repository interface `TaskRepository` in the `repository` package extending Spring Data JPA's `JpaRepository` to handle CRUD operations for tasks.

5. **Unit Tests**: Write unit tests for controllers and repositories to ensure the correctness of the implemented functionalities.

6. **Testing REST API**: Test the REST API functionalities using tools like Postman or `curl` to ensure that CRUD operations on tasks and user authentication endpoints are working as expected.

7. **Packaging**: Package the application as a war file using Maven or Gradle, or deploy it on Docker to ensure easy deployment and distribution.

8. **Main Application Class**: Create a main application class `TodoApplication.java` in the root package to bootstrap the Spring Boot application.


### User Stories:

1. **As a user, I want to log in to the application**, so that I can access my to-do list and manage my tasks securely.

2. **As a user, I want to register for an account**, so that I can create a new user profile and access the application.

3. **As a logged-in user, I want to view all tasks**, so that I can see the list of tasks I need to accomplish.

4. **As a logged-in user, I want to view a specific task by its ID**, so that I can see the details of that particular task.

5. **As a logged-in user, I want to create a new task**, so that I can add it to my to-do list.

6. **As a logged-in user, I want to update an existing task**, so that I can modify its title, description, or completion status.

7. **As a logged-in user, I want to delete a task**, so that I can remove it from my to-do list.

### Project Structure:

```
- src
  - main
    - java
      - com.mytodoapp
        - controller
          - TaskController.java
          - AuthController.java
        - dto
          - TaskDTO.java
          - AuthRequestDTO.java
          - AuthResponseDTO.java
        - model
          - Task.java
          - User.java
        - repository
          - TaskRepository.java
          - UserRepository.java
        - security
          - JwtTokenProvider.java
          - UserDetailsServiceImpl.java
          - WebSecurityConfig.java
        - service
          - TaskService.java
          - AuthService.java
        - TodoApplication.java
    - resources
      - application.properties
```

### Classes and Responsibilities:

1. **AuthController.java**: This class will handle HTTP requests and responses related to user authentication and registration, including login and potentially registration endpoints.

2. **AuthRequestDTO.java**: This class will represent the request body for user authentication, containing fields like `username` and `password`.

3. **AuthResponseDTO.java**: This class will represent the response body for successful user authentication, containing a JWT token.

4. **User.java**: This class will represent the entity for a user, including attributes like `id`, `username`, and `password`.

5. **UserRepository.java**: This class will handle database operations related to users, such as saving and querying user information.

6. **JwtTokenProvider.java**: This class will provide methods for creating and validating JWT tokens for user authentication.

7. **UserDetailsServiceImpl.java**: This class will implement Spring Security's `UserDetailsService` interface to load user-specific data during authentication.

8. **WebSecurityConfig.java**: This class will configure Spring Security to secure REST API endpoints and set up authentication mechanisms.

9. **TaskController.java**: This class remains the same and handles CRUD operations for tasks.

10. **TaskDTO.java**: This class remains the same and serves as a data transfer object for representing task data in API responses.

11. **Task.java**: This class remains the same and represents the entity for a task.

12. **TaskRepository.java**: This class remains the same and handles database operations related to tasks.

13. **TaskService.java**: This class remains the same and contains business logic related to tasks.

14. **AuthService.java**: This class will contain business logic related to user authentication and registration, such as validating credentials and generating JWT tokens.

