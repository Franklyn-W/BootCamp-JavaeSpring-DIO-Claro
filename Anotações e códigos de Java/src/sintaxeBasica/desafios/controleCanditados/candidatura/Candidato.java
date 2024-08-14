package sintaxeBasica.desafios.controleCanditados.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class Candidato {

    private String nomeCanditado;
    private Double salarioPretendido;

    public Candidato(String nomeCanditado) {
        this.nomeCanditado = nomeCanditado;
        this.salarioPretendido = ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    public String getNomeCanditado() {
        return nomeCanditado;
    }

    public Double getSalarioPretendido() {
        return salarioPretendido;
    }

    public void setNovoSalarioPretendido() {
        this.salarioPretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);;
    }

    @Override
    public String toString() {
        return nomeCanditado;
    }

}
