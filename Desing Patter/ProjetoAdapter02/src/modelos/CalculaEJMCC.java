package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import modelos.Matematica;
/**
 *
 * @author ejmcc
 */
public class CalculaEJMCC implements Matematica {

    @Override
    public int potencia(int base, int expoente) {
        int valor = 1;
        for(int n = 0; n < expoente; n++) valor = valor * base;
        return valor;
    }

    @Override
    public int raizQuadrada(int valor) {
        int numero = valor;
        int raiz = 0;
        int impar = 1;
        while (numero>=impar){
            numero = numero - impar;
            impar = impar + 2;
            raiz++;
        }
        return raiz;
    }
    
}
