package Unidade6;

import java.util.Scanner;

public class Uni6Exe4 {
    private int [] lervalores(int tamanho){
        Scanner teclado = new Scanner(System.in);
        int [] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("psiçao %d ",i);
            vetor[i] = teclado.nextInt();
        }
        return vetor;
        
    }

    private int[] somaVetor(int [] vetorA, int [] vetorB){
       int [] vSoma = new int[vetorA.length];
       for (int i = 0; i < vSoma.length; i++) {
            vSoma [i] = vetorA[i] + vetorB[i];
       }
       return vSoma;
    }

    private void mostrarVetor(int [] vetor){
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d " , vetor[i]);
        }
        System.out.println("]");
    }

    public Uni6Exe4(){
        int [] vet1 = lervalores(10);
        int [] vet2 = lervalores(10);
        int [] somavet = somaVetor(vet1, vet2);
        mostrarVetor(vet1);
        mostrarVetor(vet2);
        mostrarVetor(somavet);
        
        
        

    }
    public static void main(String[] args) {
        new Uni6Exe4();
    }
}
