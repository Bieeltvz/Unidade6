package Unidade6;
import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor [] = new int [10];
         for (int i = 0; i < vetor.length; i++){
            System.out.printf("Informe valor positivo %d " ,i);
            vetor[i] = teclado.nextInt();
        }
        System.out.println("--- MOSTRAR EM ORDEM INVERSA ---");
        for (int i = vetor.length - 1; i >= 0; i--){
        System.out.printf("Valor da posição %d ", vetor[i]);
        }
        teclado.close();
    }
    
}
