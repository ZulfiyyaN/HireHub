package com.example.hirehub.model.entity;

import com.example.hirehub.model.enumeration.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "candidates_info")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidateInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Past(message = "Date of birth should be past")
    @NotBlank(message = "Info is required")
    Integer dateOfBirth;

    Gender gender;


    String education;
    String workExperience;
    String knowledge;
    String certificate;

    @OneToOne
    @JoinColumn(name = "candidate_id")
    private CandidateEntity candidate;


}
