package redi.springfr.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetclinicApplication.class, args);
		System.out.println("HI!");
	}

}
