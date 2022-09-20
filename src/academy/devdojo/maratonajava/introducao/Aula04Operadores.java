package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
//        System.out.println(numero02-numero01);
//        System.out.println(numero02+numero01);
//        System.out.println(numero02*numero01);
//        System.out.println(numero02/numero01);
        int resultadoSoma = numero01 + numero02;
        int resultadoSubtracao = numero01 - numero02;
        int resultadoMultiplicacao = numero01 * numero02;
        double resultadoDivisao = numero01 / (double) numero02;
        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);

        //%
        int resto = 20 % 7;
        System.out.println(resto);

        //< > <= >= == != - sempre retorna boolean (true or false)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("10 é maior que 20? "+isDezMaiorQueVinte);
        System.out.println("10 é menor que 20? "+isDezMenorQueVinte);
        System.out.println("10 é igual a 20? "+isDezIgualAVinte);
        System.out.println("10 é igual a 10? "+isDezIgualADez);
        System.out.println("10 é diferente de 10? "+isDezDiferenteDeDez);

        // && (E) || (OU) !
        int idade = 20;
        float salario = 2000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta? "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta? "+isDentroDaLeiMenorQueTrinta);


    }
}
