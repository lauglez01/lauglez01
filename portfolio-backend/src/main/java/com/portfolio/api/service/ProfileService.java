package com.portfolio.api.service;

import com.portfolio.api.model.Profile;
import com.portfolio.api.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    public Profile getProfile() {
        return new Profile(
                "Laura González",
                "Desarrolladora web en formación",
                "Apasionada por crear experiencias web bonitas, accesibles y funcionales.",
                List.of("Angular", "Java", "Spring Boot", "TypeScript", "MySQL"),
                List.of(
                        new Project(
                                "Integrated Project",
                                "Aplicación full-stack en desarrollo como proyecto final.",
                                "Angular + Laravel + MySQL",
                                "https://github.com/lauglez01/tfc",
                                ""
                        ),
                        new Project(
                                "Portfolio API",
                                "API REST para exponer contenido del portfolio.",
                                "Java + Spring Boot",
                                "https://github.com/lauglez01",
                                ""
                        )
                ),
                "lauragonzalezrojas2001@gmail.com",
                "https://www.linkedin.com/in/laura-gonzález-72b23431a/"
        );
    }
}
