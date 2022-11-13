package br.edu.infnet.appfabricabebidas.model.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import static javax.persistence.InheritanceType.JOINED;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = JOINED)
public abstract class Bebida {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Float valor;

    @ManyToMany(mappedBy = "bebidas")
    private List<Malote> malotes;

    @ManyToOne
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Malote> getMalotes() {
        return malotes;
    }

    public void setMalotes(List<Malote> malotes) {
        this.malotes = malotes;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + descricao + ";" + valor;
    }
}
