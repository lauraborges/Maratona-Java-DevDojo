package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Laura");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 980, 1900});

        funcionario.imprime();

        System.out.println("Média "+ funcionario.getMedia());
    }
}
