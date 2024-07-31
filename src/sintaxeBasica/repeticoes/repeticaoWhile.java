package sintaxeBasica.repeticoes;

public class repeticaoWhile {

    public static void main(String[] args) {

        double mesada = 50.0;
        double min = 0.1;
        double max = 50.0;

        
        while (mesada > 0) {
            Double valorDoce = Math.random() * (max - min + 1) + min;

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.printf("Doce de valor R$ %.2f adicionado ao carrinho\n", valorDoce);
            mesada = mesada -valorDoce;
        }

        System.out.println("Mesada = " + mesada);
        System.out.println("Joãozinho gastou tudo em doces!");
    }
}