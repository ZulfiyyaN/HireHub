package com.example.hirehub.model.entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Entity
@Table(name = "companies_info")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyInfoEntity {
    @Id
    @Column(name = "company_id")
    Integer id;

    @Column(unique = true)
    String website;

    @Column(columnDefinition = "TEXT")
    String description; // info about company

    @Column(name = "founded_at")
    LocalDateTime foundedAt;

    @Column(nullable = false)
    String location;


    @OneToOne
    @MapsId
    @JoinColumn (name ="company_id")
    CompanyEntity company;


}
