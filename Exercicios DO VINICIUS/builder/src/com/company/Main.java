package com.company;

import builder.CarroBuilder;
import enumarators.*;

public class Main {
    private static CarroBuilder carroBuilder;
    public static void main(String[] args) {
        carroBuilder = new CarroBuilder();
        makeCar(EnumCarro.POPULAR, "Palio");
        makeCar(EnumCarro.IMPORTADO, "Civc");
        makeCar(EnumCarro.ESPORTIVO, "Jaguar");
    }

    public static void makeCar(EnumCarro tipo, String modelo) {
        switch (tipo) {
            case ESPORTIVO -> {
                System.out.println("Vendendo um " + modelo);
                carroBuilder.setTipo(EnumCarro.POPULAR.name());
                carroBuilder.setTransmissao(EnumTransmissao.MANUAL.name());
                carroBuilder.setBanco(EnumBanco.TECIDO.name());
                carroBuilder.setAcessorio(EnumAcessorio.AUSENTE.name());
                carroBuilder.setSensor(EnumSensor.AUSENTE.name());
                System.out.println(carroBuilder.getCarroEsportivo());
                System.out.println("----------------------------------");
            }
            case IMPORTADO -> {
                System.out.println("Vendendo um Civic");
                carroBuilder.setTipo(EnumCarro.IMPORTADO.name());
                carroBuilder.setTransmissao(EnumTransmissao.AUTOMATICA.name());
                carroBuilder.setBanco(EnumBanco.COURO.name());
                carroBuilder.setAcessorio(EnumAcessorio.INSULFILM.name() + " " + EnumAcessorio.FRISO_LATERAL.name());
                carroBuilder.setSensor(EnumSensor.ESTACIONAMENTO.name());
                System.out.println(carroBuilder.getCarroImportado());
                System.out.println("----------------------------------");
            }
            case POPULAR -> {
                System.out.println("Vendendo um " + modelo);
                carroBuilder.setTipo("Popular");
                carroBuilder.setTransmissao("Manual");
                carroBuilder.setBanco("Tecido");
                carroBuilder.setAcessorio(null);
                carroBuilder.setSensor(null);
                System.out.println(carroBuilder.getCarroPopular());
        System.out.println("----------------------------------");
            }
            default -> System.out.println("Tipo não identificado. Tente novamente!");
        }
    }

}
