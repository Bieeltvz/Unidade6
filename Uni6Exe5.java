package Unidade6;

import java.util.Scanner;

public class Uni6Exe5 {
    private String[] respostasRapaz = new String[5];
    private String[] respostasMoca = new String[5];

    public void lerRespostas(String[] respostas, String pessoa){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Responda com SIM, NAO ou IMD.");
        for (int i = 0; i < 5; i++) {
            System.out.print(pessoa + ", resposta para a pergunta " + (i + 1) + ": ");
            respostas[i] = teclado.next().toUpperCase();
        }
    }

    public int calcularAfinidade(){
        int afinidade = 0;
        for (int i = 0; i < 5; i++) {
            String respostaRapaz = respostasRapaz[i];
            String respostaMoca = respostasMoca[i];
            if (respostaRapaz.equals(respostaMoca)) {
                afinidade += 3;
            } else if (respostaRapaz.equals("IMD")|| respostaMoca.equals("IMD")){
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    public void exibirMensagemAfinidade(int afinidade){
        if (afinidade >= 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Voces tem muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez nao de certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor nao perder tempo");
        } else if (afinidade <= -10) {
            System.out.println("Voces se odeiam!");
        }
    }
    public static void main(String[] args) {
        Uni6Exe5 afinidade = new Uni6Exe5();
        System.out.println("Respostas do rapaz:");
        afinidade.lerRespostas(afinidade.respostasRapaz, " Rapaz");

        System.out.println("Respostas da moça:");
        afinidade.lerRespostas(afinidade.respostasMoca, "Moça");

        int indiceAfinidade = afinidade.calcularAfinidade();

        System.out.println("indice de Afinidade: " + indiceAfinidade);
        afinidade.exibirMensagemAfinidade(indiceAfinidade);
    }
    
}
