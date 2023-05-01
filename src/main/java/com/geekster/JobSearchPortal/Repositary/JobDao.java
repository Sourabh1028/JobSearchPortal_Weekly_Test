package com.geekster.JobSearchPortal.Repositary;

import com.geekster.JobSearchPortal.Model.Job;
import com.geekster.JobSearchPortal.Model.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDao extends CrudRepository <Job, Integer> {
    //Custom Finder
    public List<Job> findByLocation(String location);

    public List<Job> findByJobTypeAndLocation(JobType jobType, String location);

    public List<Job> findByJobTypeOrSalaryGreaterThan(JobType jobType, Double salary);

    public List<Job> findByDescription(String description);



    //Custom Query
    @Query(value = "Select * from job where salary > :salary", nativeQuery = true)
    public List<Job> getSalaryGreaterThan(Double salary);

    //update salary by id
    @Modifying
    @Query(value = "Update Job Set SALARY = :salary where ID = :id", nativeQuery = true)
    public void updateSalaryById(Double salary, Long id);

    //update
    @Modifying
    @Query(value = "Update Job Set LOCATION = :location where ID = :id", nativeQuery = true)
    public void updateLocationById(String location, Long id);

    @Modifying
    @Query(value = "Delete from Job where SALARY  < :salary", nativeQuery = true)
    public void DeleteJobBySalary(Double salary);


}
