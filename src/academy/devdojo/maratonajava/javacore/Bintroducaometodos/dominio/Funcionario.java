package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        } else {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
            imprimeMediaSalarial();
        }
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        } else {
            double media = 0;
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("Média salarial R$ " + media);
        }
    }
}
