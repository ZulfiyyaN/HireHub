package com.example.hirehub.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CandidateDto {

    Integer id;
    String name;
    String surname;
    String email;
    LocalDateTime createdAt;




}
