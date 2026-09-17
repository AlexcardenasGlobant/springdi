package com.globant.springdi;

import com.globant.springdi.atributo.Coche;
import com.globant.springdi.atributo.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringdiApplication.class, args);

		/*
		Motor motor = new Motor("XL1", 1981);
		Coche coche = new Coche("VW", 1986, motor);
		System.out.println(coche);
		 */
	}

}
