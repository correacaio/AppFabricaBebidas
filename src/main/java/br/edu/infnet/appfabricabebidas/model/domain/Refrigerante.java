package br.edu.infnet.appfabricabebidas.model.domain;

public class Refrigerante extends Bebida {

    private final Boolean gaseificado;
    private final int gramasAcucar;
    private final String sabor;

    public Refrigerante(String nome, String descricao, float valor, Boolean gaseificado, int gramasAcucar, String sabor) {
        super(nome, descricao, valor);
        this.gaseificado = gaseificado;
        this.gramasAcucar = gramasAcucar;
        this.sabor = sabor;
    }

    public Boolean getGaseificado() {
        return gaseificado;
    }

    public int getGramasAcucar() {
        return gramasAcucar;
    }

    public String getSabor() {
        return sabor;
    }
}
