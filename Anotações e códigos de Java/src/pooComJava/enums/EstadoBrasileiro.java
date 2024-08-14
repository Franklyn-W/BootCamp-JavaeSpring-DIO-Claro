package pooComJava.enums;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
    PARAIBA("PB", "Paraíba", 83),
    PERNAMBUCO("PE", "Pernambuco", 82);

    private String sigla;
    private String nome;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
