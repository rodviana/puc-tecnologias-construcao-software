package com.ExercicoEmSala;


import com.ExercicoEmSala.model.*;
import com.ExercicoEmSala.decorator.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executa()
	{
		ArrayList<Brinde> brindeList = new ArrayList<>();

		brindeList.add(	new BrindeFotografiaDecorator(new BrindeColoridoDecorator(new Caneca(), "preta"),"Darth Vader"));
		brindeList.add(new BrindeColoridoDecorator(new Caneta(),"Vermelha"));
		brindeList.add(new BrindeAdesivadoDecorator(new Garrafa(), "Happy Face"));

		brindeList.forEach(brinde -> System.out.println(brinde.toString()));
	}
}

