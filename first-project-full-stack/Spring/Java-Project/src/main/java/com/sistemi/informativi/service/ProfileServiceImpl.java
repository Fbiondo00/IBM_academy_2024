package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Book;
import com.sistemi.informativi.entity.Profile;
import com.sistemi.informativi.repository.ProfileRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profileRepository;
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<Profile> getProfiles() {

        List<Profile> profiles = new ArrayList<>();

        try {
            profiles= profileRepository.findAll();

        }
        catch (Exception  ex){
            ex.printStackTrace();
        }
        return profiles;
    }

    @Override
    public Profile findProfileById(String id) {
        return profileRepository.findById(id).orElseThrow(()->new EntityNotFoundException("code not found"));
    }


    @Override
    public Profile saveOrUpdateProfile(Profile profile) {
        try {
            profileRepository.save(profile);
        }
        catch(Exception ex) {
            ex.printStackTrace();

        }
        return profile;
    }

    @Override
    public Profile removeProfileById(String id) {

        try {
            profileRepository.deleteById(id);
        }
        catch(Exception ex) {
            ex.printStackTrace();

        }
        Map<String, Boolean> map= new HashMap<>();
        map.put(id + "elimination", true );
        return (Profile) map;
    }
}
