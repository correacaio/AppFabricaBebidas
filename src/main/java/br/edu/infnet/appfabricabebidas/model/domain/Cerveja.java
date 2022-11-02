package br.edu.infnet.appfabricabebidas.model.domain;

public class Cerveja extends Bebida {

    private final String tipo;
    private final Float pctAlcool;
    private final String familia;

    public Cerveja(String nome, String descricao, Float valor, String tipo, Float pctAlcool, String familia) {
        super(nome, descricao, valor);
        this.tipo = tipo;
        this.pctAlcool = pctAlcool;
        this.familia = familia;
    }

    public String getTipo() {
        return tipo;
    }

    public Float getPctAlcool() {
        return pctAlcool;
    }

    public String getFamilia() {
        return familia;
    }

    @Override
    public String toString() {
        return tipo + ";" + pctAlcool + ";" + familia;
    }
}
