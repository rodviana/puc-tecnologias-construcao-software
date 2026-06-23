/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3.resposta;

/**
 *
 * @author 20191002800895
 */
public class Eleitor {
    private static int cout=0;
    private int id;
    private int idade;
    private String sexo;
    private String voto;
    private boolean jaVotou;
    
    public Eleitor(int idade,String sexo) {
        this.id = ++Eleitor.cout;
        this.jaVotou=false;
        this.idade = idade > 18 ? idade : 18;
        this.sexo = sexo;
        this.voto="branco";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the voto
     */
    public String getVoto() {
        return voto;
    }

    /**
     * @param voto the voto to set
     */
    public void setVoto(String voto) {
        if (!isJaVotou()) this.voto=voto;
    }

    /**
     * @return the jaVotou
     */
    public boolean isJaVotou() {
        return jaVotou;
    }

    /**
     * @param jaVotou the jaVotou to set
     */
    public void setJaVotou(boolean jaVotou) {
        this.jaVotou = jaVotou;
    }
    
}
