package br.edu.infnet.appfabricabebidas.model.domain.builder;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;

public class SucoConstrutor {

    private final String nome;
    private final String descricao;
    private final Float valor;
    private final String fruta;
    private final Boolean adicaoAcucar;
    private final Float pctSucoFruta;

    private SucoConstrutor() {
        nome = null;
        descricao = null;
        valor = null;
        fruta = null;
        adicaoAcucar = null;
        pctSucoFruta = null;
    }

    private SucoConstrutor(
        String nome,
        String descricao,
        Float valor,
        String fruta,
        Boolean adicaoAcucar,
        Float pctSucoFruta
    ) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.fruta = fruta;
        this.adicaoAcucar = adicaoAcucar;
        this.pctSucoFruta = pctSucoFruta;
    }

    public static SucoConstrutor novo() {
        return new SucoConstrutor();
    }

    public SucoConstrutor nome(String nome) {
        return new SucoConstrutor(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }

    public SucoConstrutor descricao(String descricao) {
        return new SucoConstrutor(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }

    public SucoConstrutor valor(Float valor) {
        return new SucoConstrutor(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }

    public SucoConstrutor fruta(String fruta) {
        return new SucoConstrutor(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }

    public SucoConstrutor adicaoAcucar(Boolean adicaoAcucar) {
        return new SucoConstrutor(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }

    public SucoConstrutor pctSucoFruta(Float pctSucoFruta) {
        return new SucoConstrutor(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }

    public Suco constroi() {
        return new Suco(nome, descricao, valor, fruta, adicaoAcucar, pctSucoFruta);
    }
}
