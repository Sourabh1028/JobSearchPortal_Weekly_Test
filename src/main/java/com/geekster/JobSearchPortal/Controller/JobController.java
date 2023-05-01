package com.geekster.JobSearchPortal.Controller;

import com.geekster.JobSearchPortal.Model.Job;
import com.geekster.JobSearchPortal.Model.JobType;
import com.geekster.JobSearchPortal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;


    //------------------------------------- Custom Finder --------------------------------------------------

    @GetMapping(value = "/get/location/{location}")
    public List<Job> getJobByLocation(@PathVariable String location){
        return jobService.getJobByLocation(location);
    }

    @GetMapping(value = "/jobType/{jobType}/location/{location}")
    public List<Job> getJobBySalaryAndLocation(@PathVariable JobType jobType, @PathVariable String location){
        return jobService.getJobBySalaryAndLocation(jobType, location);
    }

    @GetMapping(value = "/jobType/{jobType}/salary/{salary}")
    public List<Job> getJobByjobTypeOrSalary(@PathVariable JobType jobType, @PathVariable Double salary){
        return jobService.getJobByjobTypeOrSalary(jobType, salary);
    }

    @GetMapping(value = "/job/description/{description}")
    public List<Job> getJobByDescription(@PathVariable String description){
        return jobService.getJobByDescription(description);
    }


    //------------------------------------- Custom Query --------------------------------------------------

    @GetMapping(value = "/job/salary/{salary}")
    public List<Job> getSalaryGreaterThan(@PathVariable Double salary){
        return jobService.getSalaryGreaterThan(salary);
    }

    @PutMapping(value = "/update/salary/{salary}/id/{id}")
    public void updateSalaryById(@PathVariable Double salary, @PathVariable Long id){
         jobService.updateSalaryById(salary, id);
    }

    @PutMapping(value = "/update/location/{location}/id/{id}")
    public void updateLocationById(@PathVariable String location, @PathVariable Long id){
        jobService.updateLocationById(location, id);
    }

    @DeleteMapping(value = "/Delete/Salary/{salary}")
    public void DeleteJobBySalary(@PathVariable Double salary){
        jobService.DeleteJobBySalary(salary);
    }


    @PostMapping(value = "/")
    public String updateStocks(@RequestBody List<Job> jobList){
        return jobService.updateStocks(jobList);
    }

}
