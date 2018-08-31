package edu.ksr.springboottraining;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// component-scan 
@SpringBootApplication
public class SpringboottrainingApplication implements CommandLineRunner{

	@Autowired
	StudentDAO studentDAO;
	
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringboottrainingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run is called ...");
		List<Student> list  = studentDAO.getStudents();
		System.out.println(list);
		
	}
}
