package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDate;
import java.util.List;

public class Fabrica {

    private String localizacao;
    private LocalDate dataInicializacao;
    private String tamanho;
    private Empresa empresa;
    private List<Bebida> bebidas;

    public Fabrica() {
        setDataInicializacao(LocalDate.now());
    }

    public Fabrica(Empresa empresa) {
        setEmpresa(empresa);
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
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

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    @Override
    public String toString() {
        return localizacao + ";" + dataInicializacao + ";" + tamanho + ";" + empresa + ";" + bebidas.size();
    }
}
