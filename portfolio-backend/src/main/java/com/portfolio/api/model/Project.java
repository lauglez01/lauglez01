package com.portfolio.api.model;

public record Project(
        String title,
        String description,
        String tech,
        String repository,
        String liveDemo
) {
}
