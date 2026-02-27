package com.example.hirehub.model.entity;

import com.example.hirehub.model.enumeration.JobPostingStatus;
import com.example.hirehub.model.enumeration.WorkPlace;
import com.example.hirehub.model.enumeration.WorkType;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "job_postings")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JobPostingInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Enumerated(EnumType.STRING)
    JobPostingStatus jobPostingStatus;

    @NotNull(message = "Company name is important!")
    @NotBlank(message = "Company name is important!")
    @NotEmpty(message = "Company name can be empty!")
    String companyName;

    @NotNull(message = "Job title cant be null!")
    @NotBlank(message = "Job title cant be blank!")
    @NotEmpty(message = "Job title can be empty!")
    String jobTitle;

    String eduReq;      //Education Requirements
    String expLevel;      //Experience Level
    String skills;     //Skills & Qualifications
    String location;

    @Enumerated(EnumType.STRING)
    WorkType workType;   //Full-time, Part-time etc.

    @Enumerated(EnumType.STRING)
    WorkPlace workPlace;  //Remote, On-Site or Hybrid

    Double salary;
    String position;

    @Email
    String email;

    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAtProfile = LocalDateTime.now();

    LocalDateTime expiredDate;




    @OneToOne
    @JoinColumn(name = "jobPosting_id")
    private JobPostingEntity jobPostingEntity;

}