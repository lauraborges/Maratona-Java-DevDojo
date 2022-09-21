package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        //imprime 1 a 10
        int count = 0;
        while(count < 10){
            System.out.println("While "+ ++count);
        }

        count = 0;
        do{
            System.out.println("do while"+ ++count);
        }while (count < 10);

        //3 partes, separadas por ';'
        //1º declara a variavel, 2ª comparação até onde o laço de repeticao vai ser executado, 3ª como a variavel vai alterar o status
        for (int i=0; i < 10; i++){
            System.out.println("For "+i);
        }
    }
}
