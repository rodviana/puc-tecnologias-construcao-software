package lista3.resposta;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {
    private static Scanner input;
    private static Eleicao eleicao;

    public static void inicializaCandidatos() {
        Candidato[] candidatos =
                {
                        new Candidato(35, "masc", "A"),
                        new Candidato(35, "masc", "B"),
                        new Candidato(35, "masc", "C")
                };

        for (Candidato candidato: candidatos)
            Util.registraCandidato(candidato);
    }

    public static void inicio(Eleicao eleicao) {
        Util.eleicao = eleicao;
        Util.inicializaCandidatos();
        input = new Scanner(System.in);
        int idade;
        String sexo, voto;
        final  int MAX=5;

        for (int i=0; i < MAX; ++i) {
            System.out.println("Iforme a idade do eleitor: ");
            idade=input.nextInt();
            System.out.println("Iforme o sexo do eleitor: ");
            sexo=input.next();
            System.out.println("Iforme o voto do eleitor (A, B, C): ");
            voto=input.next();
            Eleitor eleitor=new Eleitor(idade, sexo);
            eleitor.setVoto(voto);
            Util.registraVoto(eleitor);
        }
    }

    public static void registraCandidato(Candidato candidato) {
        eleicao.adiciona(candidato);
    }

    public static void registraVoto(Eleitor eleitor) {
        eleicao.adiciona(eleitor);
    }

    public static String maisVotado() {
        if (eleicao.getVencedor() != null)
            return eleicao.getVencedor().getCodigo();

        String codigoMaisVotado = null;
        int qdeVotos, maisVotado = 0;
        for (String codigoCandidato : eleicao.candidatos().keySet()) {
            qdeVotos = eleicao.eleitores(codigoCandidato).size();
            if (maisVotado < qdeVotos) {
                codigoMaisVotado = codigoCandidato;
                maisVotado = qdeVotos;
            }
        }

        Candidato vencedor = eleicao.candidato(codigoMaisVotado);
        eleicao.setVencedor(vencedor);

        return vencedor.getCodigo();
    }

    public static double mediaIdade(String sexo, Candidato candidato) {
        double media=0;

        if (eleicao.getVencedor() == null)
            return media;

        ArrayList<Eleitor> eleitores = eleicao.eleitores(candidato.getCodigo());

        if (eleitores == null)
            return media;

        int qde = 0;

        for (Eleitor eleitor : eleitores)
            if (eleitor.getSexo().equals(sexo)) {
                qde++;
                media += eleitor.getIdade();
            }

        return media / qde;
    }

    public static String preferidoPor(String sexo) {
        int qdeVotosPreferido = 0, qdeVotos;
        String codigoPreferido = null;

        for ( String codigo : eleicao.candidatos().keySet()) {
            qdeVotos = 0;

            for (Eleitor eleitor : eleicao.eleitores(codigo))
                if (eleitor.getSexo().equals(sexo))
                    qdeVotos++;

            if (qdeVotosPreferido < qdeVotos) {
                codigoPreferido = codigo;
                qdeVotosPreferido = qdeVotos;
            }
        }

        return  eleicao.candidato(codigoPreferido).getCodigo();
    }

    public static void resultado() {

        System.out.println("Canditado mais votado: ".concat(Util.maisVotado()));
        System.out.println("Média de idades dos eleitores do candidato mais votado: " +
                Util.mediaIdade("masc", eleicao.getVencedor()));

        String criterio = "masc";

        System.out.println("Candidato preferido do sexo " + criterio + ": " + Util.preferidoPor(criterio));
    }
}
