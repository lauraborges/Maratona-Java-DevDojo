package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //dado um valor de um carro quantas vezes ele pode ser parcelado
        //em que valorParcelo >=1000
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >=1; parcela--) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+parcela+", R$ "+valorParcela);
        }
    }
}
