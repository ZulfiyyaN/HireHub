package com.example.hirehub.service.companyService;

import com.example.hirehub.model.entity.CompanyInfoEntity;
import com.example.hirehub.model.requestDto.RequestCompanyDto;
import com.example.hirehub.model.responseDto.ResponseCompanyDto;
import com.example.hirehub.model.entity.CompanyEntity;
import com.example.hirehub.model.mapper.CompanyMapper;
import com.example.hirehub.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;
    private final CompanyMapper companyMapper = new CompanyMapper();

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public ResponseCompanyDto save(RequestCompanyDto requestCompanyDto) {
        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setName(requestCompanyDto.getName());
        companyEntity.setEmail(requestCompanyDto.getEmail());
        CompanyEntity company = companyRepository.save(companyEntity);

        CompanyInfoEntity info = new CompanyInfoEntity();
        info.setWebsite(requestCompanyDto.getWebsite());
        info.setDescription(requestCompanyDto.getDescription());
        info.setFoundedAt(requestCompanyDto.getFoundedAt());
        info.setLocation(requestCompanyDto.getLocation());

        info.setCompany(company);
        company.setCompanyInfo(info);

        CompanyEntity saved = companyRepository.save(company);
        return companyMapper.toDto(saved);
    }
}
