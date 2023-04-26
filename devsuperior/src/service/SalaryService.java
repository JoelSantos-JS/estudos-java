package service;

import Entities.Employ;

public class SalaryService {

    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();


    public double netSalay (Employ employ) {
        return employ.getGrossSalary() - taxService.tax(employ.getGrossSalary()) -  pensionService.discount(employ.getGrossSalary());
    }
}
