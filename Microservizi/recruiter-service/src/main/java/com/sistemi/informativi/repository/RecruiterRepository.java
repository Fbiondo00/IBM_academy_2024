package com.sistemi.informativi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemi.informativi.entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, String>{
	
	public List<Recruiter> findByExperienceYearsGreaterThan(int experienceYears);

}
