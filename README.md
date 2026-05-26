# Portfolio Full Stack (Java + Angular)

Este repositorio ahora incluye un portfolio completo con:

- **Backend** en **Java + Spring Boot** (`portfolio-backend`)
- **Frontend** en **Angular** (`portfolio-frontend`)

## Backend

```bash
cd portfolio-backend
./mvnw spring-boot:run
```

Si no tienes `mvnw`, usa Maven instalado:

```bash
mvn spring-boot:run
```

La API estará en:

- `http://localhost:8080/api/profile`

## Frontend

```bash
cd portfolio-frontend
npm install
npm start
```

La app estará en:

- `http://localhost:4200`

## Estructura

- `portfolio-backend`: API REST que devuelve perfil, skills y proyectos.
- `portfolio-frontend`: UI del portfolio consumiendo el backend.
