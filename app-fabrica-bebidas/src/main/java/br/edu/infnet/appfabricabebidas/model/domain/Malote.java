package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDateTime;
import java.util.List;
import static javax.persistence.CascadeType.DETACH;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table
public class Malote {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String status;

    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime dataSolicitacao;

    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime dataConclusao;

    @OneToOne(cascade = DETACH)
    @JoinColumn
    private Fabrica fabrica;

    private Float valorTotal;

    @ManyToMany(cascade = DETACH)
    private List<Bebida> bebidas;

    @ManyToOne
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return id + ";" + status + ";" + dataSolicitacao + ";" + dataConclusao + ";"
            + fabrica + ";" + valorTotal + ";" + bebidas.size();
    }
}
