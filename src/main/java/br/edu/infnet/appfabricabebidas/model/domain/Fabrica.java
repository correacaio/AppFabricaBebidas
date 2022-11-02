package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDate;

public class Fabrica {

    private final String localizacao;
    private final LocalDate dataInicializacao;
    private final String tamanho;

    public Fabrica(String localizacao, LocalDate dataInicializacao, String tamanho) {
        this.localizacao = localizacao;
        this.dataInicializacao = dataInicializacao;
        this.tamanho = tamanho;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public LocalDate getDataInicializacao() {
        return dataInicializacao;
    }

    public String getTamanho() {
        return tamanho;
    }
}
