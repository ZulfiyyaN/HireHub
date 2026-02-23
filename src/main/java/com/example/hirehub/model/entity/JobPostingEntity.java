package com.example.hirehub.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Entity
@Table (name= "job_postings")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JobPostingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String companyName;
    String jobTitle;
    String eduReq;      //Education Requirements
    String expLevel;      //Experience Level
    String skills;     //Skills & Qualifications
    String location;
    String empType;     //Full-time & Part-time
    Double salary;
    @Email
    String email;    // contact information
    //  @Pattern(regexp = "^(?:\\+994|0)(?:50|51|55|70|77|99|10|60)\\s?\\d{3}\\s?\\d{2}\\s?\\d{2}$",
    //           message = "Yanlış telefon formatı")
    String phone;   //  contact information
    LocalDateTime createdAtProfile;
    LocalDateTime expiredDate;
}
