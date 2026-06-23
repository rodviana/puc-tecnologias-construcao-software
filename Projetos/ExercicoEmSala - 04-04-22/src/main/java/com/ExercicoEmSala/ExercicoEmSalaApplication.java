package com.ExercicoEmSala;

import com.ExercicoEmSala.model.Caneta;
import com.ExercicoEmSala.model.Esferografica;
import com.ExercicoEmSala.model.Giz;
import com.ExercicoEmSala.model.Lapis;
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
		ArrayList<Caneta> canetaList = new ArrayList<>();
		canetaList.add(new Esferografica("azul"));
		canetaList.add(new Giz("verde"));
		canetaList.add(new Lapis("preto"));

		for(Caneta caneta:canetaList)
			Caneta.escreverTexto(caneta,"teste de escrita");

	}

}
