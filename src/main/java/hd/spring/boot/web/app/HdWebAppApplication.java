package hd.spring.boot.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@AutoConfigurationPackage
@ComponentScan({ "hd.spring.boot.web.controllers" })
public class HdWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdWebAppApplication.class, args);
	}
}
