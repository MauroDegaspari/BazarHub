package br.com.project.bazarhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.project.bazarhub.api.controller.IndexController;

@SpringBootApplication
public class BazarhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazarhubApplication.class, args);
		
		IndexController app = new IndexController();
		app.index();
	}

}
