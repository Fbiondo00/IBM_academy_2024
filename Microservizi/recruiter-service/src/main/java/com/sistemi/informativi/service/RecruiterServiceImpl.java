package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Recruiter;
import com.sistemi.informativi.repository.RecruiterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruiterServiceImpl implements RecruiterService{

	private RecruiterRepository recruiterRepository;

    public RecruiterServiceImpl(RecruiterRepository recruiterRepository) {

        this.recruiterRepository = recruiterRepository;
    }

    // BUSINESS LOGIC TO DO

    @Override
    public List<Recruiter> getRecruiters() {

        return recruiterRepository.findAll();
    }

    @Override
    public List<Recruiter> getRecruitersByExperienceYears(int experienceYears) {

        return recruiterRepository.findByExperienceYearsGreaterThan(experienceYears);
    }

    @Override
    public List<Recruiter> saveMoreRecruiters(List<Recruiter> recruiters) {
        // saveAll = metodo Spring Data JPA per inserimenti multipli
        return recruiterRepository.saveAll(recruiters);
    }
}
