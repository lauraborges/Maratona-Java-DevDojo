package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // se idade < 15 = categoria infantil
        // se idade < 18 = categoria juvenil
        // se idade >= 18 = categoria adulto

        int idade = 20;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
