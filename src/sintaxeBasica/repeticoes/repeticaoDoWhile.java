package sintaxeBasica.repeticoes;

import java.util.Random;

public class repeticaoDoWhile {
    public static void main(String[] args) {

        System.out.println("João liga para seu amigo...");

        do {
            System.out.println("Telefone tocando...");

        } while (tocando());

        System.out.println("Alou?");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }
}
