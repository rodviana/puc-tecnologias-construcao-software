package br.edu.pucgo.n2Atividade1;

import br.edu.pucgo.n2Atividade1.factory.*;
import br.edu.pucgo.n2Atividade1.model.SalgadoMappingConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class N2Atividade1Application {

	public static void main(String[] args) {
		SpringApplication.run(N2Atividade1Application.class, args);
	}

	@PostConstruct
	public static void executa()
	{
		SalgadoFactory salgadoFactory = new SalgadoFactory();

		salgadoFactory.assarSalgado(SalgadoMappingConfig.COXINHA,SalgadoMappingConfig.CEARA);
		salgadoFactory.assarSalgado(SalgadoMappingConfig.EMPADA,SalgadoMappingConfig.CEARA);
		salgadoFactory.assarSalgado(SalgadoMappingConfig.COXINHA,SalgadoMappingConfig.GOIAS);
		salgadoFactory.assarSalgado(SalgadoMappingConfig.EMPADA,SalgadoMappingConfig.GOIAS);
	}
}
