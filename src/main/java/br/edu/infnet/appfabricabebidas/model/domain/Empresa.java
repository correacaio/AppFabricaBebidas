package br.edu.infnet.appfabricabebidas.model.domain;

public class Empresa {

    private final String nome;
    private final String cnpj;
    private final Integer anoFundacao;

    public Empresa(String nome, String cnpj, Integer anoFundacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getAnoFundacao() {
        return anoFundacao;
    }
}
