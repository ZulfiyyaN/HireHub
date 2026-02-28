package com.example.hirehub.controller;

import com.example.hirehub.model.requestDto.RequestCompanyDto;
import com.example.hirehub.model.responseDto.ResponseCompanyDto;
import com.example.hirehub.service.companyService.CompanyService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<ResponseCompanyDto> saveCompany(@Valid @RequestBody RequestCompanyDto requestCompanyDto) {
        ResponseCompanyDto result = companyService.save(requestCompanyDto);
        return ResponseEntity.ok(result);
    }


}
