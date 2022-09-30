package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Seriado;

public class SeriadoTest01 {
    public static void main(String[] args) {
        Seriado seriado = new Seriado();
        seriado.init("FRIENDS", "Sitcom", 20, "Comedia");
        seriado.imprime();
    }
}
