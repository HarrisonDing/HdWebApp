package hd.spring.boot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "hd.spring.boot.web")
@MapperScan(basePackages = "hd.spring.boot.web.mapper")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "hd.spring.boot.web.repository")
@EntityScan("hd.spring.boot.web.model")
public class HdWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdWebAppApplication.class, args);
	}
}
