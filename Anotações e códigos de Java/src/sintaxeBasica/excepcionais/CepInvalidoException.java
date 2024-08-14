package sintaxeBasica.excepcionais;

public class CepInvalidoException extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2365497");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("Cep invalido");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.654-987"; // retornando cep formatado
    }

}
