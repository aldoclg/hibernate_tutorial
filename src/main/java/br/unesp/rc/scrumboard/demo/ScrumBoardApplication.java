package br.unesp.rc.scrumboard.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@ComponentScan("br.unesp.rc.scrumboard.controller")
@EntityScan(basePackages  = "br.unesp.rc.scrumboard.model")
@EnableJpaRepositories(basePackages = "br.unesp.rc.scrumboard.repository")
public class ScrumBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumBoardApplication.class, args);
	}
}
