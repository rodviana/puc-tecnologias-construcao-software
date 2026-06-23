package com.company;

import java.util.Random;
import java.util.Scanner;

public class Util {
    public Scanner input;
    public Random random;

    public  String randomString(int len) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public double randomDouble() {
        return  this.random.nextDouble();
    }

    public void display(String[] msg) {
        for (String m : msg)
            System.out.println(m);
    }
}
