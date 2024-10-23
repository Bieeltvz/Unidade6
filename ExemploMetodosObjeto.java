package Unidade6;

public class ExemploMetodosObjeto {
    public int soma (int x, int y){
        return x + y;
    } 

    public double soma(double x, double y){
        return x + y;
    }

    public int subtrai(int x, int y){
        return x-y;
    }

    public static void main(String[] args) {
        ExemploMetodosObjeto emo = new ExemploMetodosObjeto(); // criei um objeto pois o metodo nao eh static, nao pertence a classe, metodos pertencentes ao objeto.
        int a = 10;
        int b = 100;
        int resultado = emo.soma(a, b);
        System.out.println(resultado);
        resultado = emo.soma(35, 8);
        System.out.println(resultado);
        resultado = emo.soma(emo.soma(a, 10), b);
        System.out.println(resultado);
        resultado = emo.subtrai(10, 3);
        System.out.println(resultado);
        resultado = emo.subtrai(emo.soma(100, b), emo.soma(10,5));
        System.out.println(resultado);

    }
}

