package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Laptop;
import com.example.obrestdatajpa.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// CRUD
		// crear una laptop
		Laptop laptop1 = new Laptop(null, "Sony", "Vaio", 13.1, 489.99, LocalDate.of(2015, 11, 15), true);
		Laptop laptop2 = new Laptop(null, "MSI", "GP62 7REX", 15.6, 659.99, LocalDate.of(2016, 12, 8), true);

		// almacenar una laptop
		System.out.println("Numero de laptops en base de datos: " + repository.findAll().size());
		repository.save(laptop1);
		repository.save(laptop2);

		// recuperar una laptop
		System.out.println("Numero de laptops en base de datos: " + repository.findAll().size());

		// borrar una laptop
		//repository.deleteById(1L);
		System.out.println("Numero de laptops en base de datos: " + repository.findAll().size());
	}

}
