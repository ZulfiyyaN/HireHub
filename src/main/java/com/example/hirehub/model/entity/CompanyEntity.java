package com.example.hirehub.model.entity;

import com.example.hirehub.model.enumeration.CompanyStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "companies")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank(message = "Name can not be blank")
    @NotNull
    String name;

    @Email(message = "Email format is not correct ")
    @NotBlank(message = "Email info is important")
    @Column(nullable = false, unique = true)
    String email;
  //  String password;

    @Enumerated(EnumType.STRING)
    CompanyStatus status = CompanyStatus.PENDING; //by default

    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAt = LocalDateTime.now();


    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL)
    private CompanyInfoEntity companyInfo;


}
