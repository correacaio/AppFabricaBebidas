package br.edu.infnet.appfabricabebidas.model.domain;

public class Empresa {

    private Integer id;
    private String nome;
    private String cnpj;
    private Integer anoFundacao;

    public Integer getId() {
        return id;
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

    public void setId(Integer id) {
        this.id = id;
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
        return id + ";" + nome + ";" + cnpj + ";" + anoFundacao;
    }
}
