package sintaxeBasica.condicionais;

public class condicionalComposta {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            // Caso a condicional seja verdadeira, este primeiro bloco será executado.
            System.out.println("Aprovado");
        } else {
            // Caso a condicional seja falsa, será executado este bloco.
            System.out.println("Reprovado");
        }
    }
}