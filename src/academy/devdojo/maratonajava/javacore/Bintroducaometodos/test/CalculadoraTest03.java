package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(6,3);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,2));
        System.out.println("---------------------");
        calculadora.imprimeDivisaoDoisNumeros(86,0);
    }
}
