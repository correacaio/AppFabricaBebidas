package br.edu.infnet.apifabricas.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    public Usuario() { }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return id.toString();
    }
}
