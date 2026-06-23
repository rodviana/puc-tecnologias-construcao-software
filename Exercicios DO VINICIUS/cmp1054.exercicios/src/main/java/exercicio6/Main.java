package exercicio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
    }

    public static void Ex1() {
        String input = "j9i8h7g6f5e4d3c2b1a0";
        Deque<Character> deque = new ArrayDeque<>();
        init(deque,input, 0);
        print(deque, input, 0);
        print(deque, input, 1);
    }

    public static void Ex2() {
        Deque<Aluno> alunoDeque = new ArrayDeque<>();
        initAluno(alunoDeque, 10);
        System.out.println(getNotas(alunoDeque, 0));
        System.out.println(getNotas(alunoDeque, 1));
    }

    public static ArrayList<Double> getNotas(Deque<Aluno> deque, int op) {
        NotaCompare cmp = new NotaCompare();
        ArrayList<Double> notas = new ArrayList<>();
        for (Aluno aluno : deque)
            notas.add(aluno.getNotas());
        if (op == 0)
            Collections.sort(notas);
        else
            Collections.sort(notas, Collections.reverseOrder());
        return notas;
    }

    public static void initAluno(Deque<Aluno> deque, int len) {
        Scanner input = new Scanner(System.in);
        Random random = new Random(13);
        for (int i=0; i < len ; ++i) {
            System.out.println("Nome: ");
            String nome = input.nextLine();
            System.out.println("Nota: ");
            double nota = input.nextDouble();
            deque.add(new Aluno(nota, nome));
        }
    }

    public static void init(Deque<Character> deque, String input,int op) {
        for ( int i=0;i< input.length(); ++i)
            if ( input.charAt(i) != ' ')
                deque.add(input.charAt(i));
    }

    public  static void print(Deque<Character> deque, String input,int op) {
        Iterator<Character> it = op == 0 ? deque.iterator() : deque.descendingIterator();
        while (it.hasNext()) {
            char val = it.next();
            if ((op == 0 && Character.isAlphabetic(val)) || (op == 1 && Character.isDigit(val)))
                System.out.println(it.next());
        }
    }
}