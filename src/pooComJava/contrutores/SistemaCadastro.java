package pooComJava.contrutores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa(); // Construtor sem argumentos
        marcos.setEndereco("RUA DA RUA");
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
        
        
        Pessoa jose = new Pessoa("Jose","123"); // Construtor com argumentos solicitados
        jose.setEndereco("RUA DA RUA");
        System.out.println(jose.getNome() + " - " + jose.getCpf());
    }

}
