
---

# DSlist Project

This project was developed during the **Intensivão Java Spring** by **DevSuperior**. It consists of a REST API for querying games in a database, allowing organization according to the user's preferences.

---

## **Features**

The API offers the following main functionalities:

- **GetGames**: Returns the complete list of games.
- **GetGameById**: Returns details of a specific game, identified by its ID.
- **GetLists**: Returns all available lists.
- **GetGameByList**: Filters games based on a specific list defined by the user.
- **GameReplacement**: Allows the user to reorder games in the list according to their preference.

---

## **Technologies Used**

The following technologies were used in the development of the project:

- **Java 21**
- **Maven**
- **Spring Framework**
- **JPA/Hibernate**
- **PostgreSQL**
- **H2 Database** (for testing)

---

## **Project Structure**

The project follows a layered architecture aligned with the Spring Framework standards:

- **Controller**: Manages HTTP requests.
- **Service**: Implements business logic.
- **DTO (Data Transfer Object)**: Defines objects for data transfer between layers.
- **Projections**: Represents specific queries in the database.
- **Repository**: Manages database interactions.
- **Entity**: Represents domain entities (data models).

---

## **How to Run the Project**

1. Make sure **Java 21** and **Maven** are installed on your machine.

2. Clone this repository:

   ```bash
   git clone https://github.com/matheusbtguerra/DSlist.git
   ```

3. Navigate to the project folder and download the dependencies:

   ```bash
   mvn install
   ```

4. Configure the database in the `application.properties` file:

   **Example configuration:**

   ```properties
   spring.application.name=DSlist
   spring.profiles.active=${APP_PROFILE:test}
   spring.jpa.open-in-view=false

   cors.origins=${CORS_ORIGINS:http://localhost:5173,http://localhost:3000}
   ```

   ### Available Profiles:

    - **test**: Uses an in-memory H2 database.
    - **dev**: Configuration for local PostgreSQL.
    - **prod**: Configuration for deployment.

   **Detailed profile configuration:**

   **test (H2 Database):**

   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.username=sa
   spring.datasource.password=
   spring.h2.console.enabled=true
   spring.h2.console.path=/h2-console
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
   ```

   **dev (PostgreSQL):**

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5433/dslist
   spring.datasource.username=YOUR_USERNAME
   spring.datasource.password=YOUR_PASSWORD
   spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
   spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
   spring.jpa.hibernate.ddl-auto=none
   ```

   **prod:**

   ```properties
   spring.datasource.url=${DB_URL}
   spring.datasource.username=${DB_USERNAME}
   spring.datasource.password=${DB_PASSWORD}
   spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
   spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
   spring.jpa.hibernate.ddl-auto=none
   ```

5. Run the project:

   ```bash
   mvn spring-boot:run
   ```

6. Access the application in your browser:\
   [http://localhost:8080](http://localhost:8080)

---

## **Available Endpoints**

### 1. **GetGames**

- **Description**: Returns the list of all games.
- **HTTP Method**: `GET`
- **URL**: `/games`

- **Example of Request and Response**:

![GetGames Request and Response](https://github.com/matheubtguerra/DSlist/screenshots/GetGames.jpg)

---

### 2. **GetGameById**

- **Description**: Returns details of a specific game, identified by its ID.
- **HTTP Method**: `GET`
- **URL**: `/games/{gameId}`

- **Example of Request and Response**:

![GetGameById Request and Response](https://github.com/matheubtguerra/DSlist/screenshots/GetGameById.jpg)

---

### 3. **GetLists**

- **Description**: Returns all available lists.
- **HTTP Method**: `GET`
- **URL**: `/lists`

- **Example of Request and Response**:

![GetLists Request and Response](https://github.com/matheubtguerra/DSlist/screenshots/GetLists.jpg)

---

### 4. **GetGameByList**

- **Description**: Returns games filtered by a specific list.
- **HTTP Method**: `GET`
- **URL**: `/lists/{listId}/games`

- **Example of Request and Response**:

![GetGameByList Request and Response](https://github.com/matheubtguerra/DSlist/screenshots/GetGameByList.jpg)

---

### 5. **GameReplacement**

- **Description**: Allows the user to reorder games in the list according to their preference.

- **HTTP Method**: `POST`
- **URL**: `/lists/{listId}/replacement`

- **Example Body:**

  ```json
  {
    "sourceIndex": 3,
    "destinationIndex": 1
  }
  ```

- **Example of Request and Response**:

![GameReplacement Request and Response](https://github.com/matheubtguerra/DSlist/screenshots/GameReplacement.jpg)

![H2DB Before](https://github.com/matheubtguerra/DSlist/screenshots/H2Before.jpg)
![H2DB After](https://github.com/matheubtguerra/DSlist/screenshots/H2After.jpg)

---

## **Contribution**

Feel free to contribute improvements!

- Fork this repository.
- Implement your changes.
- Open a pull request.

---

## **License**

This project is licensed under the **MIT License**.  
[![MIT License](https://img.shields.io/badge/License-MIT-green)](https://opensource.org/licenses/MIT)

---

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Matheus%20Borges%20de%20Toledo%20Guerra-blue?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/matheus-borges-de-toledo-guerra-2482522b3/)

---
