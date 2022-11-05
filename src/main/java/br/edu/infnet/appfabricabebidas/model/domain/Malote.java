package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Malote {

    private Integer id;
    private String status;
    private LocalDateTime dataSolicitacao;
    private LocalDateTime dataConclusao;
    private Fabrica fabrica;
    private Float valorTotal;
    private List<Bebida> bebidas;

    public Malote() {
        setDataSolicitacao(LocalDateTime.now());
    }

    public Malote(Fabrica fabrica) {
        setFabrica(fabrica);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return id + ";" + status + ";" + dataSolicitacao + ";" + dataConclusao + ";"
            + fabrica + ";" + valorTotal + ";" + bebidas.size();
    }
}
