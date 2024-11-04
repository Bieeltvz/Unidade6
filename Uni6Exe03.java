package Unidade6;
import java.util.Scanner;

public class Uni6Exe03 {

    public Uni6Exe03(){
        double [] vetor = lerValores(12);
        mostrarVetor(vetor);
        alterarValores(vetor);
        mostrarVetor(vetor);
    }


    private double [] lerValores(int tamanho){
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** LEITURA DO VETOR ***");
        double [] vetor = new double[tamanho];
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Posição %d ", i);
            vetor [i] = teclado.nextDouble();
        }
        return vetor;
    }

    private void alterarValores(double [] vetor){
        for(int i = 0; i < vetor.length; i++){
            if(i % 2 == 0){
                vetor[i] *= 1.02;
            } else {
                vetor[i] *= 1.05;
            }
        }
    }

    private void mostrarVetor(double [] vetor){
       System.out.println("[ ");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%.2f ", vetor[i]);
        }
        System.out.println(" ] ");

    }




    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
