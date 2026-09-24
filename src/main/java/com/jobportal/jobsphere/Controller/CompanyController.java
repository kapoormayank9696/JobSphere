package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companys")

public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteByID(@PathVariable  Long id) {
        companyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
