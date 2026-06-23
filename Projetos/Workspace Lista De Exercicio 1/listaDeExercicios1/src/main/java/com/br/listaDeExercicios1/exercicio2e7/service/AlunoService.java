package com.br.listaDeExercicios1.exercicio2e7.service;

import com.br.listaDeExercicios1.exercicio2e7.model.Aluno;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public Aluno calcularMediaBimestral(Aluno aluno)
    {
        Double media;
        try {
            media = (aluno.getNotas().get(0)*2 + aluno.getNotas().get(1)*3) / 5;
            aluno.setMediaBimestral(media);
            System.out.println("O aluno "+aluno.getNome()+ " obteve média "+aluno.getMediaBimestral());
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante o cálculo da média ponderada de notas do aluno: "+ e.getMessage());
        }

        return aluno;
    }

    public Aluno calcularNotaFinal(Aluno aluno)
    {
        Double notaFinal=0.0;
        try
        {
            notaFinal = aluno.getNotas().get(0) * 0.3 +aluno.getNotas().get(1) * 0.2 +aluno.getNotas().get(2) * 0.5;
            aluno.setNotaFinal(notaFinal);
            System.out.println("O aluno "+aluno.getNome()+" tem nota final "+ aluno.getNotaFinal() + ".");

        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante o cálculo da nota final: "+e.getMessage());
            aluno.setNotaFinal(null);
        }
        return aluno;
    }
}
