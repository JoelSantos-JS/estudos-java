package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.Entities.Employ;

@Service
public class SalaryService {

    @Autowired
    TaxService taxService;
    @Autowired
    PensionService pensionService;

    public SalaryService() {

    }



    public double netSalay (Employ employ) {
        return employ.getGrossSalary() - taxService.tax(employ.getGrossSalary()) -  pensionService.discount(employ.getGrossSalary());
    }
}
