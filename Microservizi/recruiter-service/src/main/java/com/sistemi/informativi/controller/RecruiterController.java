package com.sistemi.informativi.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.sistemi.informativi.entity.Recruiter;
import com.sistemi.informativi.service.RecruiterService;

    @RestController
    @RequestMapping("rest/api/recruiters")
    public class RecruiterController {

        private RecruiterService recruiterService;

        public RecruiterController(RecruiterService recruiterService) {

            this.recruiterService = recruiterService;
        }

        @GetMapping
        public List<Recruiter> getRecruiters(){
            return recruiterService.getRecruiters();
        }

        @GetMapping("/greater-than/{experienceYears}")
        public List<Recruiter> getRecruitersByExperienceYears(@PathVariable ("experienceYears")int experienceYears){
            return recruiterService.getRecruitersByExperienceYears(experienceYears);
        }

        @PostMapping
        public List<Recruiter> saveMoreRecruiters(@RequestBody List<Recruiter> recruiters){
            return recruiterService.saveMoreRecruiters(recruiters);
        }
    }

