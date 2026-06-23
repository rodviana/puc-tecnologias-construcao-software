package exercicio6;

import java.util.Comparator;

public class NotaCompare implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno, Aluno t1) {
        return aluno.getNotas() > t1.getNotas() ? 1 : 0;
    }
}
