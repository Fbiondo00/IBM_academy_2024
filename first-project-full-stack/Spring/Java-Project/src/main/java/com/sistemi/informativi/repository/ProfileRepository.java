package com.sistemi.informativi.repository;


import com.sistemi.informativi.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,String> {
}
