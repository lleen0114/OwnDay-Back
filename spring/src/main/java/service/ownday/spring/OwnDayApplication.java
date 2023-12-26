package service.ownday.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class OwnDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnDayApplication.class, args);
	}

}
