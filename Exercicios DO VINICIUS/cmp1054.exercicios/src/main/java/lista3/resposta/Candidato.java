/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3.resposta;

/**
 *
 * @author Vinicius E. da Silva
 */
public class Candidato extends Eleitor {
    public Candidato(int idade, String sexo, String codigo) {
        super(idade, sexo);
        this.setCodigo(codigo);
    }
    private String codigo;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
