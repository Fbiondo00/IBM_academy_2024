package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.Agency;
import com.sistemi.informativi.bean.Recruiter;

import java.util.ArrayList;

public class MockRecruiterDAOImpl implements MockRecruiterDAO{

    private static ArrayList<Recruiter> recruiters = new ArrayList<>();

    @Override
    public void addRecruiter() {

        recruiters.add(new Recruiter("Andrea","Trello","rtrello@gmail.com",
                new Agency("Openjob","Rome","10283771001")));


        recruiters.add(new Recruiter("Teresa","Sperli","tsperli@libero.it",
                new Agency("Adecco","Milan","10283771002")));


        recruiters.add(new Recruiter("Giuseppe","Politano","gpolitano@virgilio.it",
                new Agency("InfoJobs","Florence","10283771003")));


    }

    @Override
    public void updateRecruiter() {

        Recruiter recruiterToUpdate = recruiters.get(1);
        recruiterToUpdate.setEmail("tsperli@virgilio.it");

    }

    @Override
    public void removeRecruiter() {

        recruiters.remove(0);

    }

    @Override
    public ArrayList<Recruiter> getRecruiters() {

        return recruiters;
    }
}
