package com.example.hirehub.model.dto;

import com.example.hirehub.model.entity.CompanyEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CompanyDto {


    Long id;
    String name;
    String email;
    LocalDateTime createdAt;

    String website;
    String description;
    LocalDateTime foundedAt;
    String location;


//    public CompanyDto companyToDto(CompanyEntity companyEntity) {
//        CompanyDto companyDto = new CompanyDto();
//        if (companyEntity == null) {
//            return null;
//        }
//        companyDto.setId(companyEntity.getId());
//        companyDto.setName(companyEntity.getName());
//        companyDto.setEmail(companyEntity.getEmail());
//        companyDto.setCreatedAt(companyEntity.getCreatedAt());
//
//        if (companyEntity.getCompanyInfo() == null) {
//            return null;
//        }
//        companyDto.setWebsite(companyEntity.getCompanyInfo().getWebsite());
//        companyDto.setDescription(companyEntity.getCompanyInfo().getDescription());
//        companyDto.setFoundedAt(companyEntity.getCompanyInfo().getFoundedAt());
//        companyDto.setLocation(companyEntity.getCompanyInfo().getLocation());
//        return companyDto;
//    }


}
