package com.example.hirehub.service.companyService;

import com.example.hirehub.model.entity.CompanyInfoEntity;
import com.example.hirehub.repository.CompanyRepository;

public class CompanyServiceImpl implements CompanyService{

  private  CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


}
