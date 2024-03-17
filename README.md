# Spring Boot WebSocket Chat Application

## Introduction

This Spring Boot application facilitates real-time chatting through a web interface, using WebSocket for live, bi-directional communication between clients and the server. It allows users to join a chat room, send messages, and see who's online.

## Getting Started

### Prerequisites

- JDK 17 or higher for local development
- Maven 3.6 or higher for local development
- Docker for containerized deployment

### Running the Application Locally

1. **Without Docker**:
   - Clone the repository and navigate into the project directory.
   - Run `mvn spring-boot:run` to start the application.
   - Access the chat application at `http://localhost:8080`.

2. **With Docker**:
   - Ensure Docker is installed and running on your machine.
   - Build the Docker image: `docker build -t chat-app .`
   - Run the Docker container: `docker run -p 8080:8080 chat-app`
   - Access the application at `http://localhost:8080`.

## Application Structure

- `src/main/java/dev/evolt/chat/`:
  - `ChatApplication.java`: Entry point of the application.
  - `config/`: Contains WebSocket and event listener configurations.
  - `chat/`: Core chat functionality including controllers and service for managing users and messages.
- `src/main/resources/`:
  - `static/`: Frontend resources (HTML, CSS, JavaScript).
  - `application.properties`: Application configurations.
- `Dockerfile`: Instructions for building a Docker image of the application.
- `pom.xml`: Maven project file with dependencies and build configuration.

## Deployment

The application is containerized using Docker, simplifying deployment across any environment supporting Docker. The included `Dockerfile` outlines the steps for creating a Docker image, which can then be run as a container.

### Live Deployment

The application is deployed and accessible at [https://chatroom-dk7c.onrender.com](https://chatroom-dk7c.onrender.com). This deployment showcases the application running in a production-like environment.

## Future Development

Consider the following enhancements to expand the application's functionality:

- Implement private messaging.
- Add user authentication and registration.
- Persist messages and user sessions through a database.
- Enhance the UI with modern frameworks like React or Vue.js.

## Conclusion

This document covers the setup, structure, and deployment of the Spring Boot WebSocket Chat Application. The application demonstrates the use of WebSockets in Spring Boot for real-time messaging. Docker support simplifies deployment across different environments, ensuring consistency and ease of use.

