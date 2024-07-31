package sintaxeBasica.repeticoes;

public class repeticaoFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i ainda é menor que 5, valor de i: " + i);
        }
        System.out.println("Laço de repetição foi encerrado, i é igual ou maior que 5");

        // exemplo de for com array
        System.out.println("\nFor com array");
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice i = " + i + " é " + alunos[i]);
        }

        // exemplo de for com matriz
        System.out.println("\nFor com matriz");
        String alunosMatriz[][] = { { "Felipe", "5", "9", "6", "3" }, { "Jonas", "7", "1", "4", "10" },
                { "Jullia", "10", "5", "4", "5" }, { "Marcos", "3", "9", "9", "2" } };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice i = " + i + " é " + alunosMatriz[i][0]);
            System.out.println("E suas notas são:");
            for (int j = 1; j < alunosMatriz[i].length; j++) {
                System.out.println(j + "º bimestre: " + alunosMatriz[i][j]);
            }
        }

        // Exemplo de foreach
        System.out.println("\nForEach");
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
