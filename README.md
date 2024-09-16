# Vaccicare Application

## Overview

The Vaccicare application is designed to manage vaccination centers, appointments, and staff availability. It enables administrators to manage vaccines, schedule home visits, and efficiently assign vaccination slots. The project includes a Spring Boot backend and a React frontend for a seamless user experience.

## Table of Contents

1. [Project Structure](#project-structure)
2. [Technologies Used](#technologies-used)
3. [Backend Setup (Spring Boot)](#backend-setup-spring-boot)
   * [Installation](#installation)
   * [Running the Application](#running-the-application)
   * [API Endpoints](#api-endpoints)
4. [Frontend Setup (React)](#frontend-setup-react)
   * [Installation](#installation-1)
   * [Running the Application](#running-the-application-1)
5. [Environment Variables](#environment-variables)
6. [Usage](#usage)
7. [Contributing](#contributing)
8. [License](#license)

## Project Structure

```
vaccicare/
│
├── backend/
│   ├── src/main/java/com/vaccicare
│   ├── src/main/resources
│   └── pom.xml
│
└── frontend/
    ├── public/
    ├── src/
    └── package.json
```

## Technologies Used

### Backend (Spring Boot):
* Java 11+
* Spring Boot
* Spring Security (JWT for authentication)
* Spring Data JPA (Hibernate)
* MySQL (or PostgreSQL)
* Lombok
* Maven

### Frontend (React):
* React.js (Hooks)
* Axios (API calls)
* React Router (navigation)
* Bootstrap (or any CSS framework)
* Redux (state management, if applicable)

## Backend Setup (Spring Boot)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Eshwarinamdar/Vaccination-Management-System.git
   cd Vaccination-Management-System/backend
   ```

2. Install dependencies using Maven:
   ```bash
   mvn clean install
   ```

3. Set up the database:
   * Create a MySQL database named `vaccicare_db` (or configure another name in `application.properties`).
   * Update your database credentials in `src/main/resources/application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/vaccicare_db
     spring.datasource.username=root
     spring.datasource.password=password
     ```

### Running the Application

```bash
mvn spring-boot:run
```

Access the backend at http://localhost:9999.

### API Endpoints

| HTTP Method | Endpoint | Description |
|-------------|----------|-------------|
| PUT | `/update-admin` | Update admin profile |
| POST | `/login-user` | Authenticate a user |
| POST | `/add-admin/{centerId}` | Add a new admin to a specific center |
| GET | `/get-home-visit-appointments/{centerId}` | Get home visit appointments for a center |
| GET | `/get-center-visit-appointments/{centerId}` | Get center visit appointments for a center |
| POST | `/assign-vaccine` | Assign a vaccine |
| POST | `/assign-vaccine-due` | Assign vaccines due for a specific task |
| POST | `/register-user` | Register a new user |
| GET | `/patient-address` | Get the address of a patient |

## Frontend Setup (React)

### Installation

1. Navigate to the frontend directory:
   ```bash
   cd ../frontend
   ```

2. Install dependencies using npm:
   ```bash
   npm install
   ```

3. Set up environment variables for connecting to the backend API by creating a `.env` file in the root of the frontend folder:
   ```env
   VITE_API_URL=http://localhost:9999
   ```

### Running the Application

1. Run the development server:
   ```bash
   npm run dev
   ```

This will start the application on http://localhost:5173.

## Environment Variables

Create a `.env` file in the frontend root directory with the following content:

```env
VITE_API_URL=http://localhost:9999
```

## Usage

**Running the Full Application:**
* Ensure both backend and frontend servers are running:
  * Backend: http://localhost:9999
  * Frontend: http://localhost:5173
* Access the frontend at http://localhost:5173, where users can log in, view vaccines, manage appointments, and more.

**Testing APIs:**
* Use Postman or Curl to test the backend APIs. After logging in via the `/login-user` endpoint, include the JWT token in the Authorization header as `Bearer {token}` for subsequent requests.

## Contributing

Contributions are welcome! Please follow these steps for contributing:

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/my-feature
   ```
3. Make your changes.
4. Commit your changes:
   ```bash
   git commit -am 'Add some feature'
   ```
5. Push to the branch:
   ```bash
   git push origin feature/my-feature
   ```
6. Create a new Pull Request.
