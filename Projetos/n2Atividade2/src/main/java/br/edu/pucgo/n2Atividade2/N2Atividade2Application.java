package br.edu.pucgo.n2Atividade2;

import br.edu.pucgo.n2Atividade2.model.Piloto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@SpringBootApplication
public class N2Atividade2Application {

	public static void main(String[] args) {
		SpringApplication.run(N2Atividade2Application.class, args);
	}

	@PostConstruct
	public void executa()
	{
		ArrayList<Piloto> pilotos = new ArrayList<>();

		pilotos.add(new Piloto("Japa", "Autodromo Internacional de Goiania"));
		pilotos.add(new Piloto("Goku"));
		pilotos.add(new Piloto("Jaspion"));
		pilotos.add(new Piloto("Rodrigo Viana"));
	}

}
