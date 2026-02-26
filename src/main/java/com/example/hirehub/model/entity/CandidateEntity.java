package com.example.hirehub.model.entity;

import com.example.hirehub.model.enumeration.CandidateStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

   // String password;

    @Enumerated(EnumType.STRING)
    CandidateStatus status = CandidateStatus.PENDING;

    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAt = LocalDateTime.now();


}
