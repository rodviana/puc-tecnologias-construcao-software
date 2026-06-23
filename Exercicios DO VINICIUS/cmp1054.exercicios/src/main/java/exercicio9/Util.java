package exercicio9;

import java.util.Scanner;

public class Util {

    public Scanner input;
    public Util() {
        input = new Scanner(System.in);
    }


    public void display(String msg) {
        System.out.println(msg);
    }

    public int getChoise(String msg) {
        display(msg);
        int opc = input.nextInt();
        return opc;
    }




}
