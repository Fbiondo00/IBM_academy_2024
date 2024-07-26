package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Book;
import com.sistemi.informativi.entity.Profile;

import java.util.List;



    public interface ProfileService {

        public List<Profile> getProfiles() ;

        public Profile findProfileById(String id);

        public Profile saveOrUpdateProfile(Profile profile) ;

        public Profile removeProfileById(String id);


    }


