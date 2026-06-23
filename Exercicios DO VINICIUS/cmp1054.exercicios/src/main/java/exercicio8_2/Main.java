package exercicio8_2;

public class Main {
    public static void main(String[] args) {
        Tecnico tec = new Tecnico("Vinicius","754.618.541-68",1123,.15);
        Administrativo adm = new Administrativo("Wilson", "349.879.371-11",3211,"manhã");

        tec.imprima();
        adm.imprima();
    }
}
