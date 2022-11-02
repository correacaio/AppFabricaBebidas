package br.edu.infnet.appfabricabebidas.model.domain.builder;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;

public class CervejaConstrutor {

    private final String nome;
    private final String descricao;
    private final Float valor;
    private final String tipo;
    private final Float pctAlcool;
    private final String familia;

    private CervejaConstrutor() {
        this.nome = null;
        this.descricao = null;
        this.valor = null;
        this.tipo = null;
        this.pctAlcool = null;
        this.familia = null;
    }

    private CervejaConstrutor(String nome, String descricao, Float valor, String tipo, Float pctAlcool, String familia) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.pctAlcool = pctAlcool;
        this.familia = familia;
    }

    public static CervejaConstrutor novo() {
        return new CervejaConstrutor();
    }

    public CervejaConstrutor nome(String nome) {
        return new CervejaConstrutor(nome, descricao, valor, tipo, pctAlcool, familia);
    }

    public CervejaConstrutor descricao(String descricao) {
        return new CervejaConstrutor(nome, descricao, valor, tipo, pctAlcool, familia);
    }

    public CervejaConstrutor valor(Float valor) {
        return new CervejaConstrutor(nome, descricao, valor, tipo, pctAlcool, familia);
    }

    public CervejaConstrutor tipo(String tipo) {
        return new CervejaConstrutor(nome, descricao, valor, tipo, pctAlcool, familia);
    }

    public CervejaConstrutor pctAlcool(Float pctAlcool) {
        return new CervejaConstrutor(nome, descricao, valor, tipo, pctAlcool, familia);
    }

    public CervejaConstrutor familia(String familia) {
        return new CervejaConstrutor(nome, descricao, valor, tipo, pctAlcool, familia);
    }

    public Cerveja constroi() {
        return new Cerveja(nome, descricao, valor, tipo, pctAlcool, familia);
    }
}
