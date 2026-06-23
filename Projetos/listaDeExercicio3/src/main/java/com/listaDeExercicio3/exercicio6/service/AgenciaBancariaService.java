package com.listaDeExercicio3.exercicio6.service;

import org.springframework.stereotype.Service;

@Service
public class AgenciaBancariaService {
    public void calculaRentabilidadeInvestimento(Double valorInvestido)
    {
        String mensagem ="";

        try
        {
            if(valorInvestido>=100)
            {
                mensagem+= "Poupança: R$ "+valorInvestido*0.5/100+" ao mês. \n" ;
                if(valorInvestido>= 1000 )
                {
                    mensagem+=  "Fundos de renda fixa: R$ "+valorInvestido*1/100+" ao mês. \n";
                    if(valorInvestido>=2500)
                        mensagem+=  "CDBs: R$ "+valorInvestido*1.5/100+" ao mês.";
                }
            }
            else
                mensagem="O valor informado não atinge o valor mínimo para ser investido";

            System.out.println(mensagem);

        }catch (Exception e)
        {
            System.out.println("Ocoreu um erro durante o cálculo da rentabilidade do investimento: "+ e.getMessage());
        }
    }
}
