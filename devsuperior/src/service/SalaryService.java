package service;

import Entities.Employ;

public class SalaryService {

    TaxService taxService;
    PensionService pensionService;

    public SalaryService() {

    }

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }


    public double netSalay (Employ employ) {
        return employ.getGrossSalary() - taxService.tax(employ.getGrossSalary()) -  pensionService.discount(employ.getGrossSalary());
    }
}
