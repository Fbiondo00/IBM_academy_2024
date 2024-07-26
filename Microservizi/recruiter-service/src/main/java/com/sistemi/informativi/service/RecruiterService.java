package com.sistemi.informativi.service;


import com.sistemi.informativi.entity.Recruiter;
import java.util.List;

public interface RecruiterService {
	
	public List<Recruiter> getRecruiters();

    public List<Recruiter> getRecruitersByExperienceYears(int experienceYears);

    public List<Recruiter> saveMoreRecruiters(List<Recruiter> recruiters);		
	

}
