package br.edu.infnet.appfabricabebidas.model.domain;

public class Suco extends Bebida {

    private final String fruta;
    private final Boolean adicaoAcucar;
    private final Float pctSucoFruta;

    public Suco(String nome, String descricao, Float valor, String fruta, Boolean adicaoAcucar, Float pctSucoFruta) {
        super(nome, descricao, valor);
        this.fruta = fruta;
        this.adicaoAcucar = adicaoAcucar;
        this.pctSucoFruta = pctSucoFruta;
    }

    public String getFruta() {
        return fruta;
    }

    public Boolean getAdicaoAcucar() {
        return adicaoAcucar;
    }

    public Float getPctSucoFruta() {
        return pctSucoFruta;
    }
}
