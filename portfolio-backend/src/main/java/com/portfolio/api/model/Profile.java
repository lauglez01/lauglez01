package com.portfolio.api.model;

import java.util.List;

public record Profile(
        String name,
        String role,
        String about,
        List<String> skills,
        List<Project> projects,
        String email,
        String linkedin
) {
}
