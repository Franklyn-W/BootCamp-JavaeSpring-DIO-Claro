package pooComJava.gettersESetters;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        // caso o nome da variável a ser recebida seja igual o nome do atributo a ser modificado, deve-se utilizar a palavra reservada this para indicar a modificação do atributo local.
    }

}
