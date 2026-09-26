package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.company.CompanyResponse;
import com.jobportal.jobsphere.entity.Company;
import com.jobportal.jobsphere.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/companys")

public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyResponse> getCompanyById(@PathVariable Long id) {
        Company company = companyService.getCompanyById(id);
        CompanyResponse response = new CompanyResponse(
                company.getId(),
                company.getCompanyName(),
                company.getDescription(),
                company.getIndustry(),
                company.getWebsite(),
                company.getEmail(),
                company.getPhone(),
                company.getLocation(),
                company.getAddress(),
                company.getCity(),
                company.getState(),
                company.getCountry(),
                company.getPostalCode(),
                company.getCompanySize(),
                company.getFoundedYear()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteByID(@PathVariable  Long id) {
        companyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
