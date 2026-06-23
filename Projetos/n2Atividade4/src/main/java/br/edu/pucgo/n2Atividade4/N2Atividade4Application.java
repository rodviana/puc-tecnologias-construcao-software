package br.edu.pucgo.n2Atividade4;

import br.edu.pucgo.n2Atividade4.modal.Caminhao;
import br.edu.pucgo.n2Atividade4.modal.Carro;
import br.edu.pucgo.n2Atividade4.modal.Veiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@SpringBootApplication
public class N2Atividade4Application {

	public static void main(String[] args) {
		SpringApplication.run(N2Atividade4Application.class, args);
	}

	@PostConstruct
	public void executa()
	{
		ArrayList<Veiculo> veiculos= new ArrayList<>();
		veiculos.add(new Carro("Firestone", 16, 4));
		veiculos.add(new Caminhao("Michelin", 30, 6));

		veiculos.forEach(veiculo -> System.out.println(veiculo.toString()));

	}
}
