# EasyBooking - Microservices Room Reservation System 🏨

![Microservices Architecture](https://img.shields.io/badge/Architecture-Microservices-blue) ![Spring Boot](https://img.shields.io/badge/Backend-Spring%20Boot-green) ![React](https://img.shields.io/badge/Frontend-React-blue) ![Kubernetes](https://img.shields.io/badge/Deployment-Kubernetes-326CE5)

EasyBooking is a modern, scalable room reservation system built with microservices architecture. It provides secure authentication and seamless room booking management.

## ✨ Key Features

- **Core Services**
  - Room reservation with real-time availability
  - OAuth2 authentication & authorization
- **Infrastructure**
  - Containerized with Docker
  - Kubernetes orchestration
  - API Gateway routing
  - Load balancing with NGINX
- **DevOps**
  - CI/CD pipelines with GitHub Actions
  - Code quality analysis with SonarQube
  - Comprehensive monitoring

## 🛠 Technology Stack

| Category        | Technologies                          |
|-----------------|---------------------------------------|
| Backend         | Spring Boot, Spring Security, JPA     |
| Frontend        | React                                 |
| Database        | MySQL, PostgreSQL (SonarQube)         |
| Infrastructure  | Docker, Kubernetes                    |
| DevOps          | GitHub Actions, SonarQube             |

## 🚀 Getting Started

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/EasyBooking.git
    cd EasyBooking
    
Build and start services:

    ```bash
    docker-compose build
    docker-compose up
    
Access Services
Service	URL
User Service	http://localhost:8081
OAuth Service	http://localhost:8082
Reservation Service	http://localhost:8083
SonarQube	http://localhost:9000
SonarQube Credentials: admin/admin

🏗 Project Structure
EasyBooking/
├── api-gateway/          # API Gateway configuration
├── ci-cd/                # GitHub Actions workflows
├── infrastructure/       # Infrastructure setup
├── k8s/                  # Kubernetes manifests
├── monitoring/           # Monitoring configurations
├── services/             # Microservices
│   ├── oauth-service/    # Authentication
│   ├── reservation/      # Booking logic
│   ├── room-service/     # Room management  
│   └── user-service/     # User profiles
└── README.md
🔄 CI/CD Pipeline
On Push to Main:

Build and test all services

Docker image creation

SonarQube analysis

Deployment to staging

Quality Gates:

Code coverage > 80%

Zero critical vulnerabilities

<3% code duplication
