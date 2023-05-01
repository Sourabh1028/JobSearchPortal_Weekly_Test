package com.geekster.JobSearchPortal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NonNull
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    private String companyName;
    @Column(unique = true)
    private String employerName;

    @Enumerated(EnumType.STRING)//only for watching strings in DB.
    private JobType jobType;
}
