package br.edu.puc.trabalhoN1;

import br.edu.puc.trabalhoN1.autobots.factory.AutobotFacoryImpl;
import br.edu.puc.trabalhoN1.autobots.model.Autobot;
import br.edu.puc.trabalhoN1.autobots.model.EnumNomeTipoAutobot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@SpringBootApplication
public class TrabalhoN1Application {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoN1Application.class, args);
	}

	@PostConstruct
	public void executa()
	{
		Integer count = 0;
		AutobotFacoryImpl autobotFacory = new AutobotFacoryImpl();
		ArrayList<Autobot> autobotList = new ArrayList<>();
		autobotList.add(autobotFacory.summonAutobot(EnumNomeTipoAutobot.Optimus.toString()));
		autobotList.add(autobotFacory.summonAutobot(EnumNomeTipoAutobot.Ratchet.toString()));
		autobotList.add(autobotFacory.summonAutobot(EnumNomeTipoAutobot.Sylverbolt.toString()));
		autobotList.add(autobotFacory.summonAutobot(EnumNomeTipoAutobot.Skydive.toString()));
		autobotList.add(autobotFacory.summonAutobot(EnumNomeTipoAutobot.Bumblebee.toString()));
		autobotList.add(autobotFacory.summonAutobot(EnumNomeTipoAutobot.Ironhide.toString()));
		for(Autobot autobot:autobotList){
			count++;
			System.out.println("\nAUTOBOT "+count+":");
			autobot.printCardAutobot();
		}

	}

}
