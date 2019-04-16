package com.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee e = getEmployee();
		
		empRepo.save(e);
		
	}
	
	private Employee getEmployee() {
		
		Employee e = new Employee();
		e.setAge(40);
		e.setName("Suchi");
		return e;
	}
	

}
