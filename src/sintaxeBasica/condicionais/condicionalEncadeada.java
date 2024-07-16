package sintaxeBasica.condicionais;

public class condicionalEncadeada {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            // Caso a condicional seja verdadeira, este primeiro bloco será executado.
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            // Caso a primeira condicional seja falsa, sera verificado a segunda condicional que será executada, caso seja verdadeira
            System.out.println("Recuperação");
        } else {
            // Caso a condicional seja falsa, será executado este bloco.
            System.out.println("Reprovado");
        }
    }
}
