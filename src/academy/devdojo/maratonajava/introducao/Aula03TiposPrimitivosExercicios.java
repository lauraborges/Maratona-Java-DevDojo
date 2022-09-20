package academy.devdojo.maratonajava.introducao;

import org.testng.annotations.Test;

public class Aula03TiposPrimitivosExercicios {
    String nome = "Laura";
    String endereco = "Rua Alegria, 36";
    double salario = 2000.00;
    String dataRecebimentoSalario = "20/12/2021";
    String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$ "+salario+" na data "+dataRecebimentoSalario;

    @Test
    void imprimeRelatorio(){
        System.out.println(relatorio);
    }
}
