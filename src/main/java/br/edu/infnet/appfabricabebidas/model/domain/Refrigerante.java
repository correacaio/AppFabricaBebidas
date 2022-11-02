package br.edu.infnet.appfabricabebidas.model.domain;

public class Refrigerante extends Bebida {

    private Boolean gaseificado;
    private Integer gramasAcucar;
    private String sabor;

    public Boolean getGaseificado() {
        return gaseificado;
    }

    public Integer getGramasAcucar() {
        return gramasAcucar;
    }

    public String getSabor() {
        return sabor;
    }

    public void setGaseificado(Boolean gaseificado) {
        this.gaseificado = gaseificado;
    }

    public void setGramasAcucar(Integer gramasAcucar) {
        this.gramasAcucar = gramasAcucar;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + gaseificado + ";" + gramasAcucar + ";" + sabor;
    }
}
