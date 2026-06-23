package com.ExercicoEmSala;

import com.ExercicoEmSala.adapater.AdapterCelsius;
import com.ExercicoEmSala.model.Celsius;
import com.ExercicoEmSala.model.Fahrenheit;
import com.ExercicoEmSala.model.Termometro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executa()
	{
		Termometro termometroFahrenheit = new Fahrenheit(70.0);
		System.out.println(termometroFahrenheit.toString());
		Celsius termometroCelsius = new AdapterCelsius(termometroFahrenheit);
		System.out.println(termometroCelsius.toString());

	}
}

