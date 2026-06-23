package exercicio7;
/***
 *  2 - No programa principal, crie o seguinte menu:
 *
 * #####################
 * # 1 - Inserir aluno #
 * # 2 - Excluir aluno #
 * # 3 - Listar        #
 * # 7 - Sair          #
 * #####################
 * Digite a opcao:
 */
/**
 *    3 - Para Inserir, requisite a entrada do nome e da matrícula.
 *      - No programa principal, crie uma hashMap com o par <Integer, ArrayList<Aluno>> .
 *      Cada entrada no mapa é um ArrayList.
 *      As chaves Integer devem ser geradas aleatoriamente entre 1 e 5.
 *      A inserção ocorre em cada chave, lembrando que ao inserir o objeto Aluno,
 *          use o método add no ArrayList para inserir sempre no final.
 *
 *    4 - Para remover, requisite o nome do aluno. Procure-o no mapa, encontre o
 *      objeto contendo o nome dado e remova-o do ArrayList.
 *
 *    5 - Para listar o mapa, use uma Entry.
 */

public class Main {
    public static void main(String[] args) {
        menu();
        executa(Util.input.nextInt());
    }

    public static void menu() {
        print("###############################");
        print("[1] - Inserir aluno");
        print("[2] - Excluir aluno");
        print("[3] - Listar aluno");
        print("[0] - Sair");
        print("###############################");
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void executa(int opc) {

    }
}
