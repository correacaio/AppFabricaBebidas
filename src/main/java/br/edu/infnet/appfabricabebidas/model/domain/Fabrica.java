package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDate;

public class Fabrica {

    private String localizacao;
    private LocalDate dataInicializacao;
    private String tamanho;

    public String getLocalizacao() {
        return localizacao;
    }

    public LocalDate getDataInicializacao() {
        return dataInicializacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setDataInicializacao(LocalDate dataInicializacao) {
        this.dataInicializacao = dataInicializacao;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return localizacao + ";" + dataInicializacao + ";" + tamanho;
    }
}
