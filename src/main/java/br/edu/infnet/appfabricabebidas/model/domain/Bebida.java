package br.edu.infnet.appfabricabebidas.model.domain;

public abstract class Bebida {

    private String nome;
    private String descricao;
    private Float valor;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome + ";" + descricao + ";" + valor;
    }
}
