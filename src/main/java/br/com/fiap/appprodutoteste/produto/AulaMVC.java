package br.com.fiap.appprodutoteste.produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.fiap.appprodutoteste.produto.controllers, br.com.fiap.appprodutoteste.produto.config"})
public class AulaMVC {

	public static void main(String[] args) {
		SpringApplication.run(AulaMVC.class, args);
	}

}
