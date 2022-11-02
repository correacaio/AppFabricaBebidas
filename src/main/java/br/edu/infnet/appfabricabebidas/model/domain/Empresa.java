package br.edu.infnet.appfabricabebidas.model.domain;

public class Empresa {

    private String nome;
    private String cnpj;
    private Integer anoFundacao;

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getAnoFundacao() {
        return anoFundacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setAnoFundacao(Integer anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String toString() {
        return nome + ";" + cnpj + ";" + anoFundacao;
    }
}
