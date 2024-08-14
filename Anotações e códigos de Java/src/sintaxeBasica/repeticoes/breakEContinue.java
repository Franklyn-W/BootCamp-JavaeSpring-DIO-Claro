package sintaxeBasica.repeticoes;

public class breakEContinue {

    public static void main(String[] args) {

        // Laço for com break, para toda a execução do bloco de código ao atingir a condição indicada
        System.out.println("Com break");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
            }
            System.err.println(numero);
        }

        // Laçõ for com continue, pula a execução do bloco no momento que a condição é atingida
        System.out.println("\nCom continue");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue;
            }
            System.err.println(numero);
        }
    }
}
