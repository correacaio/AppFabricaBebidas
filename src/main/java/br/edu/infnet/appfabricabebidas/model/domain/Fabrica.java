package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDate;

public class Fabrica {

    private Integer id;
    private String nome;
    private String cnpj;
    private LocalDate dataCriacao;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
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

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cnpj + ";" + dataCriacao;
    }
}
