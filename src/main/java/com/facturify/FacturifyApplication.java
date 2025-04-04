package com.facturify;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class FacturifyApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("DATABASE_URL", Objects.requireNonNull(dotenv.get("DATABASE_URL")));
		System.setProperty("DATABASE_USERNAME", Objects.requireNonNull(dotenv.get("DATABASE_USERNAME")));
		System.setProperty("DATABASE_PASSWORD", Objects.requireNonNull(dotenv.get("DATABASE_PASSWORD")));

		SpringApplication.run(FacturifyApplication.class, args);
	}

}
