package com.example.hirehub.model.mapper;

import com.example.hirehub.model.responseDto.ResponseCompanyDto;
import com.example.hirehub.model.entity.CompanyEntity;

public class CompanyMapper {

    public ResponseCompanyDto toDto(CompanyEntity companyEntity){
        if(companyEntity==null){
            return null;
        }
        ResponseCompanyDto responseCompanyDto = new ResponseCompanyDto();

//        responseCompanyDto.setId(companyEntity.getId());
        responseCompanyDto.setName(companyEntity.getName());
        responseCompanyDto.setEmail(companyEntity.getEmail());


        if(companyEntity.getCompanyInfo()!=null){
            responseCompanyDto.setWebsite(companyEntity.getCompanyInfo().getWebsite());
            responseCompanyDto.setDescription(companyEntity.getCompanyInfo().getDescription());
            responseCompanyDto.setCreatedAt(companyEntity.getCreatedAt());
            responseCompanyDto.setLocation(companyEntity.getCompanyInfo().getLocation());
            responseCompanyDto.setFoundedAt(companyEntity.getCompanyInfo().getFoundedAt());
        }
        return responseCompanyDto;
    }
}
