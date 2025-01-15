package org.generation.jaita138.demo4;

import java.util.List;

import org.generation.jaita138.demo4.db.entity.Employee;
import org.generation.jaita138.demo4.db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hello, World!");
		System.out.println("---------------------------------------------------");

		Employee emp1 = new Employee();
		emp1.setName("Guybrush");
		emp1.setLastname("Threepwood");
		emp1.setBio("Mighty pirate");
		emp1.setSalary(1000000);

		System.out.println(emp1);
		employeeService.insertEmployee(emp1);
		System.out.println(emp1);

		List<Employee> employees = employeeService.findAll();
		System.out.println(employees);

		System.out.println("---------------------------------------------------");
		System.out.println("The end.");
	}
}
