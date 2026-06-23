/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.resposta;

import java.lang.reflect.Constructor;

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
class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario () {
        return this.salario;
    }
    
    public double reajuste() {
        return this.salario * .25;
    }
    public double salarioComReajuste() {
        return this.salario * 1.25;
    }
}
