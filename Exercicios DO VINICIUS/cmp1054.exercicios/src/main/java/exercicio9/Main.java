package exercicio9;

import java.util.ArrayList;

public class Main {
    public static final int BARCO = 0;
    public static final int BICICLETA = 1;
    public static final int CARRO = 2;
    private static Util util;
    private static ArrayList<Veiculo> veiculos;

    public static void main(String[] args) {
        util = new Util();
        final int qde =  util.getChoise("Informe a quantidade de veículos a serem criados: ");
        veiculos = new ArrayList<>();
        init(qde);
        print();
    }

    public static void init(int qde) {
        for (int i=0; i< qde; ++i) {
            util.display("Informe o tipo de veículo:");
            int opc = util.getChoise("[0] Barco\n[1] Bicicleta\n[2]Carro");
            getType(opc);
        }
    }

    public static void getType(int opc) {
        String tipo;
        String motor;
        double quilometragem;
        util.display("Iforme o tipo do combustível: ");
        tipo = util.input.next();
        util.display("Iforme o tipo do motor:");
        motor = util.input.next();
        util.display("Iforme a quilometragem:");
        quilometragem = util.input.nextDouble();
        switch (opc) {
            case BARCO:
                veiculos.add(new Barco(tipo,motor,quilometragem,0.0));
                break;
            case BICICLETA:
                veiculos.add(new Bicicleta(tipo,motor,quilometragem,.23));
                break;
            case CARRO:
                veiculos.add(new Carro(tipo,motor,quilometragem,1.24));
                break;
            default:
                util.display("Opção inválida! Tente novamente.");
                break;
        }
    }

    public static void print() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }


}
