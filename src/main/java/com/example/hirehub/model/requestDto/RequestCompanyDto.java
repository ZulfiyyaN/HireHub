package com.example.hirehub.model.requestDto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RequestCompanyDto {


    String name;
    String email;

    String website;
    String description;
    LocalDateTime foundedAt;
    String location;
}
