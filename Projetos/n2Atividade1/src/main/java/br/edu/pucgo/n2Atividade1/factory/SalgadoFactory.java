package br.edu.pucgo.n2Atividade1.factory;

import br.edu.pucgo.n2Atividade1.model.SalgadoMappingConfig;
import br.edu.pucgo.n2Atividade1.model.Salgado;
import lombok.Getter;
import lombok.Setter;

public class SalgadoFactory {
    SalgadoIngredientesFactory ingredientes;
    @Getter @Setter // para retornar o atributo salgadinho
    Salgado salgadinho;

    // utilize esse método para criar um salgadinho conforme tipo (coxinha ou empada) e região (Ceara ou Goias).
    public void assarSalgado(String tipo, String regiao)
    {
        SalgadoIngredientesFactory salgadoIngredientesFactory = null;
        try{
            if(SalgadoMappingConfig.COXINHA.equalsIgnoreCase(tipo))
                salgadoIngredientesFactory = this.getIngredientesCoxinha(regiao);
            else if(SalgadoMappingConfig.EMPADA.equalsIgnoreCase(tipo))
                salgadoIngredientesFactory = this.getIngredientesEmpada(regiao);

            if (salgadoIngredientesFactory==null)
                throw new ClassNotFoundException();

            this.salgadinho= new Salgado();
            this.salgadinho.setMassa(salgadoIngredientesFactory.criarMassa());
            this.salgadinho.setMolho(salgadoIngredientesFactory.criarMolho());
            this.salgadinho.setRecheio(salgadoIngredientesFactory.criarRecheio());

            System.out.println(tipo + " - " + regiao);
            System.out.println(salgadinho.toString());
        }catch (ClassNotFoundException e)
        {
            System.out.println("O tipo informada não foi identificada pelo sistema: "+ regiao);
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a criação da 'SalgadoIngredienteFactory'");
        }
    }

    // utilize esse método para retornar um objeto do tipo SalgadoIngredientesFactory de acordo com a região (Ceara ou Goias) específico para a coxinha.
    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao)
    {
        SalgadoIngredientesFactory salgadoIngredientesFactory = null;
        try{
            if(SalgadoMappingConfig.GOIAS.equalsIgnoreCase(regiao))
                salgadoIngredientesFactory = new GoiasCoxinhaIngredientesFactory();
            else if(SalgadoMappingConfig.CEARA.equalsIgnoreCase(regiao))
                salgadoIngredientesFactory = new CearaCoxinhaIngredientesFactory();

            if (salgadoIngredientesFactory==null)
                throw new ClassNotFoundException();
        }catch (ClassNotFoundException e)
        {
            System.out.println("A região informada não foi identificada pelo sistema: "+ regiao);
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a criação da 'SalgadoIngredienteFactory'");
        }

        return salgadoIngredientesFactory;
    }

    // utilize esse método para retornar um objeto do tipo SalgadoIngredientesFactory de acordo com a região (Ceara ou Goias) específico para a empada.
    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao){
        SalgadoIngredientesFactory salgadoIngredientesFactory = null;
        try{
            if(SalgadoMappingConfig.GOIAS.equalsIgnoreCase(regiao))
                salgadoIngredientesFactory = new GoiasEmpadaIngredientesFactory();
            else if(SalgadoMappingConfig.CEARA.equalsIgnoreCase(regiao))
                salgadoIngredientesFactory = new CearaEmpadaIngredientesFactory();

            if (salgadoIngredientesFactory==null)
                throw new ClassNotFoundException();
        }catch (ClassNotFoundException e)
        {
            System.out.println("A região informada não foi identificada pelo sistema: "+ regiao);
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a criação da 'SalgadoIngredienteFactory'");
        }

        return salgadoIngredientesFactory;
    }

}
