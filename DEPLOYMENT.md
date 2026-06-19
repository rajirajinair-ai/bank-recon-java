# Deployment Document

## Prerequisites
- Docker & Docker Compose installed on the host machine.
- Minimum 8GB RAM, 4 CPU cores (Linux/Ubuntu recommended).
- Ports 80, 8080, and 3306 available.

## Components
1. **Frontend:** React application served via Nginx (Port 80)
2. **Backend:** Spring Boot application running on Java 21 (Port 8080)
3. **Database:** MySQL 8.x database (Port 3306)

## Steps to Deploy

### 1. Clone the repository
```bash
git clone <repository_url>
cd bank-reconciliation-platform
```

### 2. Environment Variables
Create a `.env` file in the root directory (or use docker-compose defaults). Ensure you configure:
- `MYSQL_ROOT_PASSWORD`
- `MYSQL_DATABASE`
- `MYSQL_USER`
- `MYSQL_PASSWORD`

### 3. Build and Run via Docker Compose
To start the entire stack:
```bash
docker-compose up -d --build
```

### 4. Verify Services
- **Frontend:** http://localhost
- **Backend API Docs:** http://localhost:8080/swagger-ui.html
- **Database:** Connect via a MySQL client to `localhost:3306`

### 5. Viewing Logs
To view logs for the backend container:
```bash
docker-compose logs -f backend
```

## Scaling
- Use Docker Swarm or Kubernetes for production environments.
- Redis can be added for session management across scaled backend instances.
