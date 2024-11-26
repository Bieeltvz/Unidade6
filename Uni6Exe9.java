package Unidade6;

import java.util.Scanner;

public class Uni6Exe9 {
    private int[] sexo;
    private int[] nota;
    private int[] idade;

    public Uni6Exe9(int numClientes){
        sexo = new int[numClientes];
        nota = new int[numClientes];
        idade = new int[numClientes];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numClientes; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo[i] = teclado.nextInt();
            System.out.print("Nota (0 a 10): ");
            nota[i] = teclado.nextInt();
            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();
            System.out.println();
        }
        teclado.close();
    }

    public double calcularNotaMediaCinema(){
        int somaNotas = 0;
        for (int i = 0; i < nota.length; i++) {
            somaNotas += nota[i];
        }
        return (double) somaNotas / nota.length;
    }

    public double calcularNotaMediaHomens(){
        int somaNotasHomens = 0;
        int contHomens = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2) {
                somaNotasHomens += nota[i];
                contHomens++;
            }
        }
        return contHomens > 0 ? (double) somaNotasHomens / contHomens : 0;
    }

    public int notaMulherMaisJovem(){
        int menorIdade = Integer.MAX_VALUE;
        int notaMaisJovem = -1;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] < menorIdade) { 
                menorIdade = idade[i];
                notaMaisJovem = nota[i];
            }
        }
        return notaMaisJovem;
    }

    public int contarMulheresAcima50NotaSuperior(double mediaCinema){
        int contMulheres = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaCinema) {
                contMulheres++;
            }
        }
        return contMulheres;
    }

    public static void main(String[] args) {
        int numClientes = 30;
        Uni6Exe9 pesquisa = new Uni6Exe9(numClientes);
        double mediaCinema = pesquisa.calcularNotaMediaCinema();
        double mediaHomens = pesquisa.calcularNotaMediaHomens();
        int notaMulherMaisJovem = pesquisa.notaMulherMaisJovem();
        int mulheresAcima50NotaSuperior = pesquisa.contarMulheresAcima50NotaSuperior(mediaCinema);
        System.out.printf("Nota média recebida pelo cinema: %.2f%n", mediaCinema);
        System.out.printf("Nota média atribuída pelos homens: %.2f%n", mediaHomens);
        System.out.printf("Nota atribuída pela mulher mais jovem: %d%n", notaMulherMaisJovem);
        System.out.printf("Número de mulheres com mais de 50 anos que deram nota superior à média do cinema: %d%n", mulheresAcima50NotaSuperior);
    }
    
}
