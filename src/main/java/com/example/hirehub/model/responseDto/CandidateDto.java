package com.example.hirehub.model.responseDto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CandidateDto {

    Long id;
    String name;
    String surname;
    String email;
    LocalDateTime createdAt;




}
