package br.edu.infnet.appfabricabebidas.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Cerveja extends Bebida {

    private String tipo;
    private Float pctAlcool;
    private String familia;

    public String getTipo() {
        return tipo;
    }

    public Float getPctAlcool() {
        return pctAlcool;
    }

    public String getFamilia() {
        return familia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPctAlcool(Float pctAlcool) {
        this.pctAlcool = pctAlcool;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + tipo + ";" + pctAlcool + ";" + familia;
    }
}
