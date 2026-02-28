package com.example.hirehub.service.companyService;

import com.example.hirehub.model.requestDto.RequestCompanyDto;
import com.example.hirehub.model.responseDto.ResponseCompanyDto;


public interface CompanyService {


  ResponseCompanyDto save(RequestCompanyDto requestCompanyDto);

}
