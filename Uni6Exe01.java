package Unidade6;
import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com seuu inteiro: ");
        int numero = teclado.nextInt();
        int vetor [] = new int [10];
        vetor[9] = numero;
         for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
            numero -= vetor[i];
            System.out.println("Entre com seuu inteiro: ");

        }
    }
    
}
