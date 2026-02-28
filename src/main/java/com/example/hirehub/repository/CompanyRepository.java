package com.example.hirehub.repository;

import com.example.hirehub.model.entity.CompanyEntity;
import com.example.hirehub.model.entity.CompanyInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {


}
