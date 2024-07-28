package CRUD_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "CRUD_Application.model")
public class CRUD_Application {
	public static void main(String[] args) {
		SpringApplication.run(CRUD_Application.class, args);
	}
}
