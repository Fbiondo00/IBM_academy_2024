package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.Recruiter;

import java.util.ArrayList;

public interface MockRecruiterDAO {


    public void addRecruiter();

    public void updateRecruiter();

    public void removeRecruiter();

    public ArrayList<Recruiter> getRecruiters();

}
