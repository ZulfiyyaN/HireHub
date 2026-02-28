package com.example.hirehub.model.responseDto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseCompanyDto {

//    Long id;
    String name;
    String email;
    LocalDateTime createdAt;

    String website;
    String description;
    LocalDateTime foundedAt;
    String location;
 }
