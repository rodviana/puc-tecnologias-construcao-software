package lista3.resposta;

import java.util.*;

public class Eleicao {
    private Map<String, ArrayList<Eleitor>> urna;
    private Map<String, Candidato> candidatos;
    private Candidato vencedor;

    public Eleicao() {
        urna = new HashMap<>();
        candidatos = new HashMap<>();
    }

    public Candidato getVencedor() {
        return vencedor;
    }

    public void setVencedor(Candidato vencedor) {
        if (this.vencedor == null)
            this.vencedor = vencedor;
    }

    public Candidato candidato(String voto) {
        return candidatos.get(voto);
    }

    public ArrayList<Eleitor> eleitores(String codigoCandidato) {
        return codigoCandidato != null ? urna.get(codigoCandidato) : null;
    }

    public Map<String, Candidato> candidatos() {
        return this.candidatos;
    }

    public void adiciona(Candidato candidato) {
        if (!candidatos.containsKey(candidato.getCodigo())) {
            candidatos.put(candidato.getCodigo(), candidato);
            urna.put(candidato.getCodigo(), new ArrayList<>());
        }
    }

    public void adiciona(Eleitor eleitor) {
        if (urna.containsKey(eleitor.getVoto()) && !eleitor.isJaVotou()) {
            urna.get(eleitor.getVoto()).add(eleitor);
            eleitor.setJaVotou(true);
        }
    }
}