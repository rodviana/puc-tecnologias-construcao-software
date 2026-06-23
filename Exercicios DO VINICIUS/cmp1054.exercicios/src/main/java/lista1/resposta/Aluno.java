/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.resposta;

/**
 *
 * @author Vinicius E. da silva
 * Pontifícia Universidade Católica de Goiás
 * Disciplina: cmp1054 Tecnologia de construção de software
 * Goiânia 18 de fevereiro de 2022
 * Professor: ANIBAL SANTOS JUKEMURA
 * 
 * Lista de exercícios 1 - N1
 */
public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    
    Aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getNota1() {
        return this.n1;
    }
    
    public double getNota2() {
        return this.n2;
    }
    
    
    double mediaPonderada() {
        return (n1 * 2.0 + n2 * 3) / (2.0 + 3.0);
    }
}
