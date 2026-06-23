package br.edu.pucgo.n2Atividade3.director;

import br.edu.pucgo.n2Atividade3.builder.CarroBuilder;
import br.edu.pucgo.n2Atividade3.model.Carro;

public class CarroDirector {
    CarroBuilder carroBuilder;

    public CarroDirector(CarroBuilder carroBuilder)
    {
        this.carroBuilder = carroBuilder;
    }

    public Carro buildCarro(String modelo)
    {
        Carro carro = new Carro();

        if(carroBuilder==null)
            return null;

        carro.setModelo(modelo);
        carro.setTipo(this.carroBuilder.buildTipo());
        carro.setTransmissao(this.carroBuilder.buildTransmissao());
        carro.setBanco(this.carroBuilder.buildBanco());
        carro.setAcessorio(this.carroBuilder.buildAcessorio());
        carro.setSensor(this.carroBuilder.buildSensor());

        return carro;
    }
}
