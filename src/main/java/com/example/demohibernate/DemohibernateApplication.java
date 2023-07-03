package com.example.demohibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemohibernateApplication {

	public static void main(String[] args) {
		//Test push
		ConfigurableApplicationContext context= SpringApplication.run(DemohibernateApplication.class, args);
	
	PersonneRepository personneRepository=context.getBean(PersonneRepository.class)	;
	Personne p= new Personne();
	p.setName("Mohamed Salah");
	System.out.println(p.getName());
	
	personneRepository.save(p);
	
	for (Personne personne: personneRepository.findAll()) {
		System.out.println(personne.getName());
		
	}
	
	
	
	
	
	
	}

}
