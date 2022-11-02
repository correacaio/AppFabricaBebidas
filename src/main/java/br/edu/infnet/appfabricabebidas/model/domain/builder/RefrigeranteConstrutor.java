package br.edu.infnet.appfabricabebidas.model.domain.builder;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;

public class RefrigeranteConstrutor {

    private final String nome;
    private final String descricao;
    private final Float valor;
    private final Boolean gaseificado;
    private final Integer gramasAcucar;
    private final String sabor;

    private RefrigeranteConstrutor() {
        this.nome = null;
        this.descricao = null;
        this.valor = null;
        this.gaseificado = null;
        this.gramasAcucar = null;
        this.sabor = null;
    }

    private RefrigeranteConstrutor(String nome, String descricao, Float valor, Boolean gaseificado, Integer gramasAcucar, String sabor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.gaseificado = gaseificado;
        this.gramasAcucar = gramasAcucar;
        this.sabor = sabor;
    }

    public static RefrigeranteConstrutor novo() {
        return new RefrigeranteConstrutor();
    }

    public RefrigeranteConstrutor nome(String nome) {
        return new RefrigeranteConstrutor(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }

    public RefrigeranteConstrutor descricao(String descricao) {
        return new RefrigeranteConstrutor(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }

    public RefrigeranteConstrutor valor(Float valor) {
        return new RefrigeranteConstrutor(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }

    public RefrigeranteConstrutor gaseificado(Boolean gaseificado) {
        return new RefrigeranteConstrutor(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }

    public RefrigeranteConstrutor gramasAcucar(Integer gramasAcucar) {
        return new RefrigeranteConstrutor(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }

    public RefrigeranteConstrutor sabor(String sabor) {
        return new RefrigeranteConstrutor(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }

    public Refrigerante constroi() {
        return new Refrigerante(nome, descricao, valor, gaseificado, gramasAcucar, sabor);
    }
}
