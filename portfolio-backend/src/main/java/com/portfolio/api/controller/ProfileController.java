package com.portfolio.api.controller;

import com.portfolio.api.model.Profile;
import com.portfolio.api.service.ProfileService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public Profile getProfile() {
        return profileService.getProfile();
    }
}
