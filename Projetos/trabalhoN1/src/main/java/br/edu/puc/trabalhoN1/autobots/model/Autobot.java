package br.edu.puc.trabalhoN1.autobots.model;

import lombok.Getter;
import lombok.Setter;

public abstract class Autobot {

    Autobot(String nome,String tipo, Integer ataque, Integer vida,Integer defesa, String especialidade)
    {
        this.nome = nome;
        this.tipo=tipo;
        this.ataque = ataque;
        this.vida = vida;
        this.especialidade = especialidade;
        this.defesa=defesa;
    }
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String tipo;
    @Getter @Setter
    private Integer ataque;
    @Getter @Setter
    private Integer vida;
    @Getter @Setter
    private Integer defesa;
    @Getter @Setter
    private String especialidade;

    public Autobot() {

    }


    public void assembleAutobot()
    {
        System.out.println("Invocando Autobot...");
    }

    /*Não utilzei o método abstrado como solicitado, pois não encontrei nenhuma diferença entre o print dos cards
    * Não utilizei o parâmetro nome, pois não encontrei utilidade na identificação do autobot, já que esse é um método nativo da etidade*/
    public void printCardAutobot ()
    {

        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println("Ataque: "+this.ataque);
        System.out.println("Vida: "+this.vida);
        System.out.println("Defesa: "+this.defesa);
        System.out.println(this.especialidade);
    }
}
