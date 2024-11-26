package Unidade6;

import java.util.Scanner;

public class Uni6Exe6 {
    private double[] vetor; 

    public Uni6Exe6(int n) {
        vetor = new double[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe " + n + " valores reais para preencher o vetor:");

        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
    }

    public boolean encontrarValor(double valor) {
        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor (N): ");
        int n = scanner.nextInt();
        Uni6Exe6 buscaVetor = new Uni6Exe6(n);
        System.out.print("Informe um valor para procurar no vetor: ");
        double valorProcurado = scanner.nextDouble();
        boolean encontrado = buscaVetor.encontrarValor(valorProcurado);

        if (encontrado) {
            System.out.println("O valor " + valorProcurado + " está cadastrado no vetor.");
        } else {
            System.out.println("O valor " + valorProcurado + " não foi encontrado no vetor.");
        }
    }
}
