package Unidade6;

public class ExemploMetodos {

    public static int soma (int x, int y){
        return x + y;
    } 

    public static double soma(double x, double y){
        return x + y;
    }

    public static int subtrai(int x, int y){
        return x-y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int resultado = soma(a, b);
        System.out.println(resultado);
        resultado = soma(35, 8);
        System.out.println(resultado);
        resultado = soma(soma(a, 10), b);
        System.out.println(resultado);
        resultado = subtrai(10, 3);
        System.out.println(resultado);
        resultado = subtrai(soma(100, b), soma(10,5));
        System.out.println(resultado);

    }
}
//o q n eh static pertence ao objeto
//static pertence a classe
// void n precisa de retorno