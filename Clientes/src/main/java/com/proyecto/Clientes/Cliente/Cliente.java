package com.proyecto.Clientes.Cliente;

public class Cliente {

    Integer id;
    String pNombre, sNombre, pApellido, sApellido, Nit;

    public Cliente(Integer id, String pNombre, String sNombre, String pApellido, String sApellido, String nit) {
        this.id = id;
        this.pNombre = pNombre;
        this.sNombre = sNombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        Nit = nit;
    }

    public Cliente(Integer id, String pNombre, String pApellido, String nit) {
        this.id = id;
        this.pNombre = pNombre;
        this.pApellido = pApellido;
        Nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", pNombre='" + pNombre + '\'' +
                ", sNombre='" + sNombre + '\'' +
                ", pApellido='" + pApellido + '\'' +
                ", sApellido='" + sApellido + '\'' +
                ", Nit='" + Nit + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }
}
