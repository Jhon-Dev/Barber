package main.barber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="main.model")
@ComponentScan(basePackages = {"main.*"}) // Mapeia todos os pacotes
@EnableJpaRepositories(basePackages = {"main.repository"})
@EnableTransactionManagement
public class BarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberApplication.class, args);
	}

}
