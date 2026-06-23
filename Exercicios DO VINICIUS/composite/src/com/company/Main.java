package com.company;

import interfaces.Container;
import interfaces.Produto;
import models.Caixa;
import models.Fruta;
import models.Verdura;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Verdura> verduras;
    private static ArrayList<Fruta> frutas;
    private static Container caixaDeFrutas;
    private static Container caixaDeVerdura;
    private static Container caixaMista;

    public static void inicialize() {
        inicializeProdutos();
        inicializeConteianers();
    }

    public static void inicializeProdutos() {
        inicializeFrutas();
        inicializeVerduras();
    }

    public static void inicializeFrutas()  {
        if (frutas == null)
            frutas = new ArrayList<>();
        frutas.add(new Fruta("Pera", 5.5));
        frutas.add(new Fruta("Banana", 6.7));
    }

    public static void inicializeVerduras()  {
        if (verduras == null)
            verduras = new ArrayList<>();
        verduras.add(new Verdura("Alface", 7));
        verduras.add(new Verdura("Cenoura", 9));
    }

    public static void inicializeConteianers()  {
        inicializeCaixaVerduras();
        inicializeCaixaFrutas();
        inicializeCaixaMista();
    }

    public static void inicializeCaixaFrutas() {
        caixaDeFrutas = new Caixa("Caixa de fruta");
        if (frutas == null)
            inicializeFrutas();
        for (Produto fruta : frutas) {
            caixaDeFrutas.adicione(fruta);
        }
    }

    public static void inicializeCaixaVerduras() {
        caixaDeVerdura = new Caixa("Caixa de verduras");
        if (verduras == null)
            inicializeVerduras();
        for (Produto verdura : verduras) {
            caixaDeVerdura.adicione(verdura);
        }
    }

    public static void inicializeCaixaMista() {
        caixaMista = new Caixa("Caixa mista");
        if (frutas == null)
            inicializeFrutas();
        if (verduras == null)
            inicializeVerduras();

        for (Produto fruta : frutas) {
            caixaMista.adicione(fruta);
        }

        for (Produto verdura : verduras) {
            caixaMista.adicione(verdura);
        }
    }

    public static void main(String[] args) {
        inicialize();
        caixaDeFrutas.imprima();
        caixaDeVerdura.imprima();
        caixaMista.imprima();
    }
}
