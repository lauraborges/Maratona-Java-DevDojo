package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 5100;
        String mensagemDoar = "Vou doar R$ 500,00 pro DevDojo";
        String mensagemNaoDoar = "Estou pobre, não vou doar pro DevDojo";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
