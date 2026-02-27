package com.example.hirehub.model.entity;

import com.example.hirehub.model.enumeration.CandidateStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "candidates")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotBlank(message = "Name can not be blank!")
    @NotNull
    String name;

    @NotBlank(message = "Surname can not be blank!")
    @NotNull
    String surname;

    @Email(message = "Email format is not correct ")
    @NotBlank(message = "Email info is important")
    @Column(unique = true, nullable = false)
    String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^(\\+994|0)?(50|51|55|70|77|99|10|60)\\d{7}$",
            message = "Please enter a valid Azerbaijan mobile number (e.g. +994501234567)")
    String phone;

    // String password;

    @Enumerated(EnumType.STRING)
    CandidateStatus status = CandidateStatus.PENDING;

    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAt = LocalDateTime.now();

    @OneToOne(mappedBy = "candidate", cascade = CascadeType.ALL)
    private CandidateInfoEntity candidateInfo;


}
