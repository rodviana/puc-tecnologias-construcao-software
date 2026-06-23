package exercicio8_1;

import java.util.Random;
import java.util.Scanner;

public class Util {
    public static Random random;
    public static Scanner input;

    public Util() {
        random = new Random();
        input = new Scanner(System.in);
    }

    public double  random() {
        return random.nextDouble();
    }

    public void display(String[] input) {
        for (String in: input) display(in);
    }

    public void display(String msg) {
        System.out.println(msg);
    }
}
