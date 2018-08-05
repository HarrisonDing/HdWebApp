package hd.spring.boot.web.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @AutoConfigurationPackage
// @ComponentScan({ "hd.spring.boot.web.controllers",
// "hd.spring.boot.web.exceptions" })
@ComponentScan(basePackages = "hd.spring.boot.web")
@MapperScan(basePackages = "hd.spring.boot.web.mapper")
@EnableAutoConfiguration
public class HdWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdWebAppApplication.class, args);
	}
}
