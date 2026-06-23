package exercicio8_1;

public class Main {
    private static Util utl;
    public static void main(String[] args) {
        utl = new Util();
        for (int i=0; i<5;++i)
            if (i%2==0)
                System.out.println(getNovo());
            else
                System.out.println(getVelho());
    }

    public static Novo getNovo() {
        return new Novo(getEndeco(), utl.random(), utl.random()) ;
    }

    public static Velho getVelho() {
        return new Velho(getEndeco(), utl.random(), utl.random()) ;
    }

    public static String getEndeco() {
        utl.display("Endereço: ");
        return utl.input.nextLine();
    }
}
