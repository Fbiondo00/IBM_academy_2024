package com.sistemi.informativi.controller;

import com.sistemi.informativi.entity.Book;
import com.sistemi.informativi.entity.Profile;
import com.sistemi.informativi.service.BookService;
import com.sistemi.informativi.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/api/profiles")
public class ProfileRestController {

    private ProfileService profileService;

    private ProfileRestController(ProfileService profileService) {

        this.profileService = profileService;
    }


    @GetMapping
    public List<Profile> getprofiles(){

        return profileService.getProfiles();

    }



    @GetMapping("/id/{id}")
    public Profile getProfileById(@PathVariable String id) {

        return profileService.findProfileById(id);

    }



    @PutMapping
    public Profile updateProfile(@RequestBody Profile profile) {

        return profileService.saveOrUpdateProfile(profile);

    }

    @PostMapping
    public Profile saveProfile(@RequestBody Profile profile) {

        return profileService.saveOrUpdateProfile(profile);

    }

    @DeleteMapping("/id/{id}")

    public Profile removeProfile(@PathVariable String id){
        return profileService.removeProfileById(id);
    }

}