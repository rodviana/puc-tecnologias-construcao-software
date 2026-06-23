package br.edu.pucgo.n2Atividade3;

import br.edu.pucgo.n2Atividade3.builder.CarroEsportivoBuilder;
import br.edu.pucgo.n2Atividade3.builder.CarroImportadoBuilder;
import br.edu.pucgo.n2Atividade3.builder.CarroPopularBuilder;
import br.edu.pucgo.n2Atividade3.director.CarroDirector;
import br.edu.pucgo.n2Atividade3.model.Carro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@SpringBootApplication
public class N2Atividade3Application {

	public static void main(String[] args) {
		SpringApplication.run(N2Atividade3Application.class, args);
	}

	@PostConstruct
	public void executa()
	{
		ArrayList<Carro> carroList = new ArrayList<>();

		carroList.add(new CarroDirector(new CarroPopularBuilder()).buildCarro("Pálio"));
		carroList.add(new CarroDirector(new CarroImportadoBuilder()).buildCarro("Civc"));
		carroList.add(new CarroDirector(new CarroEsportivoBuilder()).buildCarro("Jaguar"));

		carroList.forEach(carro -> System.out.println(carro.toString()));
	}
}
