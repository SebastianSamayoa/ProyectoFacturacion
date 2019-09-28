package com.proyecto.Clientes.Objeto;

public class Direccion {

    Integer Id;
    String Avenida;
    String nCalle;
    String nCasa;
    String nZona;
    String Departamento;
    String Municipio;



    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAvenida() {
        return Avenida;
    }

    public void setAvenida(String avenida) {
        Avenida = avenida;
    }

    public String getnCalle() {
        return nCalle;
    }

    public void setnCalle(String nCalle) {
        this.nCalle = nCalle;
    }

    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    public String getnZona() {
        return nZona;
    }

    public void setnZona(String nZona) {
        this.nZona = nZona;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }
}
