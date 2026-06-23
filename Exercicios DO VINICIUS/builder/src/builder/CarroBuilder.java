package builder;

import models.Carro;
import models.CarroEsportivo;
import models.CarroImportado;
import models.CarroPopular;

public class CarroBuilder extends Carro implements Builder {

    public CarroBuilder(String tipo, String transmissao, String bancos, String acessorios, String sensor) {
        super(tipo, transmissao, bancos, acessorios, sensor);
    }

    public CarroBuilder() {
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setBanco(String bancos) {
        this.bancos = bancos;
    }

    @Override
    public void setAcessorio(String acessorios) {
        this.acessorios = acessorios;
    }

    @Override
    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
    public CarroPopular getCarroPopular() {
        return new CarroPopular(tipo, transmissao, bancos, acessorios, sensor);
    }

    public CarroEsportivo getCarroEsportivo() {
        return new CarroEsportivo(tipo, transmissao, bancos, acessorios, sensor);
    }

    public CarroImportado getCarroImportado() {
        return new CarroImportado(tipo, transmissao, bancos, acessorios, sensor);
    }

}
