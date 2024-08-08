package pooComJava.gettersESetters;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        /*
         * Como os atributos nome e idade são privadas, não é possivel utiliza-las em
         * outra classe
         * 
         * felipe.nome = "Felipe";
         * felipe.idade = 8;
         * 
         * System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade +
         * " anos");
         */

        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
