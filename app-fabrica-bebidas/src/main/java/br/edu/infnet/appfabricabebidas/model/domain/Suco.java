package br.edu.infnet.appfabricabebidas.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Suco extends Bebida {

    private String fruta;
    private Boolean adicaoAcucar;
    private Float pctSucoFruta;

    public String getFruta() {
        return fruta;
    }

    public Boolean getAdicaoAcucar() {
        return adicaoAcucar;
    }

    public Float getPctSucoFruta() {
        return pctSucoFruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public void setAdicaoAcucar(Boolean adicaoAcucar) {
        this.adicaoAcucar = adicaoAcucar;
    }

    public void setPctSucoFruta(Float pctSucoFruta) {
        this.pctSucoFruta = pctSucoFruta;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + fruta + ";" + adicaoAcucar + ";" + pctSucoFruta;
    }
}
