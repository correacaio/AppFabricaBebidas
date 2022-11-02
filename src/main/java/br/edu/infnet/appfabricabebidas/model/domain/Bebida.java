package br.edu.infnet.appfabricabebidas.model.domain;

public abstract class Bebida {

    private final String nome;
    private final String descricao;
    private final Float valor;

    public Bebida(String nome, String descricao, Float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getValor() {
        return valor;
    }
}
