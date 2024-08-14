package sintaxeBasica.desafios.controleFluxo;

public class ParametrosInvalidosException extends Exception{

    @Override
    public String getMessage() {
        return "O segundo parametro deve maior que o primeiro";
    }

    

    

}