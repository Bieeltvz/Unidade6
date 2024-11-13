package Unidade6;
import java.util.Scanner;

public class Uni6Exe10 {
    private static final int TAMANHO_VETOR = 5;

public Uni6Exe10(){
    Scanner teclado = new Scanner(System.in);
    int [] valores = new int[TAMANHO_VETOR];
    int opcao = 0;
    int posicaoFim = 0;
    do {
    mostraMenu();
    opcao = teclado.nextInt();
    switch (opcao) {
        case 1:
            posicaoFim = incluir(valores, posicaoFim, teclado);
            break;
        case 2:
            int posicao = pesquisar(valores, posicaoFim, teclado);
            if (posicao >= 0){
                System.out.printf("Valor encontrado na posição %d.%n", posicao);
            } else {
                System.out.println("Valor não encontrado!");
            }
            break;
        case 3:
            alterar(valores, posicaoFim, teclado);
            break;
        case 4: 
            posicaoFim = excluir(valores, posicaoFim, teclado);
            break;
        case 5:
            mostraVetor(valores, posicaoFim);
            break;
        case 6:
                ordenaVetor(valores, posicaoFim);
            break;
        case 7:
            break;
        case 8:
        System.out.println("FIM");
        break;
    
        default:
           System.out.printf("Opção \"%d\"invalida!!!%n", opcao);
           break;
    }
    } while (opcao != 8);
}

private void ordenaVetor(int[] vetor, int posicaoFim) {
    for (int i = 0; i < posicaoFim - 1; i++) {
        for (int j = 0; j < posicaoFim - 1 - i; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
}
private void mostraVetor(int [] vetor, int posicaoFim) {
    for (int i = 0; i < posicaoFim; i++) {
        System.out.printf("%2d ", vetor[i]);
    }
    System.out.println("");
}

private int excluir(int [] vetor, int posicaoFim, Scanner teclado){
    int posicao = pesquisar(vetor, posicaoFim, teclado);
    if (posicao != -1){
        for (int i = posicao; i < (posicaoFim - 1); i++){
            vetor[i] = vetor[i + 1];
            System.out.println("Valor excluido com sucesso!!!");
    
        return --posicaoFim;
    }
}
System.out.println("Valor não existe para ser excluido.");
return posicaoFim;
}

private void alterar(int [] vetor, int posicaoFim, Scanner teclado){
    int posicao = pesquisar(vetor, posicaoFim, teclado);
    if (posicao != -1){
        System.out.printf("Informe valor a ser trocado na posição  %d: ", posicao);
        vetor[posicao] = teclado.nextInt();
        System.out.println("Valor trocado com sucesso!!!");
    } else {
        System.out.println("Valor não existe. Impossivel trocar!");
    }
}

private int pesquisar(int [] vetor, int posicaoFim, Scanner teclado){
        System.out.print("Informe o valor a pesquisar: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < posicaoFim; i++){
            if (vetor[i] == valor){
                return i;
        }
    }
        return -1;
}

private int incluir(int [] vetor, int posicaoFim, Scanner teclado){
    if (posicaoFim < vetor.length){
        System.out.printf("Informe valor (posição %d): ", posicaoFim);
        vetor[posicaoFim] = teclado.nextInt();
        System.out.printf("Valor %d inserido com sucesso na posição %d.%n", vetor[posicaoFim], posicaoFim );
        posicaoFim++;
    } else {
        System.out.println("VETOR CHEIO!!!\nNão é possivel adicionar valores.");
    }
    return posicaoFim;
}


    private void mostraMenu(){
        System.out.println("*** MENU PRINCIPAL ***");
        System.out.println("1 - Incluir valor ");
        System.out.println("2 - Pesquisar valor:");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
        System.out.println("Informe a opção desejada:");
}

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}


/* “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
“7 – Inverter valores”: desafio (ver abaixo);
“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa. */