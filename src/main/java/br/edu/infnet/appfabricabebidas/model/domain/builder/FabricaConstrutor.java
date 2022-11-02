package br.edu.infnet.appfabricabebidas.model.domain.builder;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import java.time.LocalDate;

public class FabricaConstrutor {

    private final String localizacao;
    private final LocalDate dataInicializacao;
    private final String tamanho;

    private FabricaConstrutor() {
        localizacao = null;
        dataInicializacao = null;
        tamanho = null;
    }

    private FabricaConstrutor(String localizacao, LocalDate dataInicializacao, String tamanho) {
        this.localizacao = localizacao;
        this.dataInicializacao = dataInicializacao;
        this.tamanho = tamanho;
    }

    public static FabricaConstrutor novo() {
        return new FabricaConstrutor();
    }

    public FabricaConstrutor localizacao(String localizacao) {
        return new FabricaConstrutor(localizacao, dataInicializacao, tamanho);
    }

    public FabricaConstrutor dataInicializacao(LocalDate dataInicializacao) {
        return new FabricaConstrutor(localizacao, dataInicializacao, tamanho);
    }

    public FabricaConstrutor tamanho(String tamanho) {
        return new FabricaConstrutor(localizacao, dataInicializacao, tamanho);
    }

    public Fabrica constroi() {
        return new Fabrica(localizacao, dataInicializacao, tamanho);
    }
}
