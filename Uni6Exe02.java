package Unidade6;
import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [] valores = new double[12];
        for(int i = 0; i < valores.length; i++) {
            System.out.print("Informe valor: ");
            valores[i] = teclado.nextDouble();
        }
        double acumulaValores = 0;
        for (double valor : valores) { // para cada valor de dentro de valores faça
            acumulaValores += valor;
        }
        double media = acumulaValores / valores.length;
       
       // for (int i = 0; i < valores.length; i++){
         //   if(valores[i] > media){
           //     System.out.println("Valor %d" , valores[i]);
          //  }

          for(double valor : valores){
            System.out.printf("%s", valor > media ? String.format("%f", valor) : "");
          }
          teclado.close();
        }
}
