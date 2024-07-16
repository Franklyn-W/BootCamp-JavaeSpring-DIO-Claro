package sintaxeBasica.condicionais;

public class condicionalTernaria {
    public static void main(String[] args) {
        int nota = 6;

        System.out.println("Execeução do ternario simples: " + ternarioSimples(nota));
        System.out.println("Execeução do ternario encadeado: " + ternarioEncadeado(nota));

    }

    public static String ternarioSimples(int nota) {

        // Exemplo de ternário simples
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        /*
         * Se nota for mais que 7, atribuir a variavel resultado a string "Aprovado", se
         * não, atribuir "Reprovado"
         */
        return resultado;
    }

    public static String ternarioEncadeado(int nota) {

        String resultado = nota >= 7 ? "Aproovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        return resultado;
    }

}
