package com.devsuperior.Aulas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.Entities.Employ;
import com.devsuperior.services.SalaryService;

@SpringBootApplication
@ComponentScan({ "com.devsuperior.Entities", "com.devsuperior.services" })

public class AulasApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	




    public static void main(String[] args) {
		SpringApplication.run(AulasApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employ  employ = new Employ("Joel", 2550);



	System.out.println(salaryService.netSalay(employ));
	}

}
