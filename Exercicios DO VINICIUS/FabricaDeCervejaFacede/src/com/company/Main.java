package com.company;

import models.*;

import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ales> ales = new ArrayList<>();
        ArrayList<Largers> largers = new ArrayList<>();

        ales.add(new Ale());
        ales.add(new Porter());
        ales.add(new Stout());
        ales.add(new Trigo());

        largers.add(new Larger());
        largers.add(new Munich());
        largers.add(new Vienna());

        for (Ales ale : ales)
            ale.produza();

        for (Largers larger : largers)
            larger.produza();
    }
}
