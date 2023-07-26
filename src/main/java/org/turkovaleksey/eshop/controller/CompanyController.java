package org.turkovaleksey.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turkovaleksey.eshop.repository.api.CompanyRepository;
import org.turkovaleksey.eshop.repository.model.company.Company;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private CompanyRepository companyRepository;

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/")
    public List<Company> getCompany(){
        return companyRepository.findAll();
    }

}
