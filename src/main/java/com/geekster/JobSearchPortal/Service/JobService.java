package com.geekster.JobSearchPortal.Service;

import com.geekster.JobSearchPortal.Model.Job;
import com.geekster.JobSearchPortal.Model.JobType;
import com.geekster.JobSearchPortal.Repositary.JobDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobDao jobDao;

    //------------------------------------- Custom Finder --------------------------------------------------

    public List<Job> getJobByLocation(String location) {
        return jobDao.findByLocation(location);
    }

    public List<Job> getJobBySalaryAndLocation(JobType jobType, String location) {
        return jobDao.findByJobTypeAndLocation(jobType, location);
    }

    public List<Job> getJobByjobTypeOrSalary(JobType jobType, Double salary) {
        return jobDao.findByJobTypeOrSalaryGreaterThan(jobType, salary);
    }

    public List<Job> getJobByDescription(String description) {
        return jobDao.findByDescription(description);
    }


    //------------------------------------- Custom Query --------------------------------------------------

    public List<Job> getSalaryGreaterThan(Double salary) {
        return jobDao.getSalaryGreaterThan(salary);
    }
    @Transactional
    public void updateSalaryById(Double salary, Long id) {
        jobDao.updateSalaryById(salary, id);
    }

    @Transactional
    public void updateLocationById(String location, Long id) {
        jobDao.updateLocationById(location, id);
    }

    @Transactional
    public void DeleteJobBySalary(Double salary) {
        jobDao.DeleteJobBySalary(salary);
    }

    public String updateStocks(List<Job> jobList) {
        Iterable<Job> list = jobDao.saveAll(jobList);
        if(list!=null)
        {
            return "Added list of Job.....!!!";
        }
        else
        {
            return "Could not added..!!!";
        }
    }

}
