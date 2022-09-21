package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double => 0
        //char imprime espaco em branco
        //boolean => false
        //String =>null

        String[] nomes = new String[4];
        nomes[0] = "Laura";
        nomes[1] = "Laurinha";
        nomes[2] = "Laurao";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
