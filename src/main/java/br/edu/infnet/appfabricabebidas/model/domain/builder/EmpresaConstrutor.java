package br.edu.infnet.appfabricabebidas.model.domain.builder;

import br.edu.infnet.appfabricabebidas.model.domain.Empresa;

public class EmpresaConstrutor {

    private final String nome;
    private final String cnpj;
    private final Integer anoFundacao;

    private EmpresaConstrutor() {
        this.cnpj = null;
        this.nome = null;
        this.anoFundacao = null;
    }

    private EmpresaConstrutor(String nome, String cnpj, Integer anoFundacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
    }

    public static EmpresaConstrutor novo() {
        return new EmpresaConstrutor();
    }

    public EmpresaConstrutor nome(String nome) {
        return new EmpresaConstrutor(nome, cnpj, anoFundacao);
    }

    public EmpresaConstrutor cnpj(String cnpj) {
        return new EmpresaConstrutor(nome, cnpj, anoFundacao);
    }

    public EmpresaConstrutor anoFundacao(Integer anoFundacao) {
        return new EmpresaConstrutor(nome, cnpj, anoFundacao);
    }

    public Empresa constroi() {
        return new Empresa(
            nome,
            cnpj,
            anoFundacao
        );
    }
}
