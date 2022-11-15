package br.edu.infnet.appfabricabebidas.model.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table
public class Fabrica {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String nome;
    private String cnpj;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataCriacao;

    @ManyToOne
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cnpj + ";" + dataCriacao;
    }
}
