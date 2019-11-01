/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.objetos;

import java.util.List;

/**
 *
 * @author Sebastian Samayoa
 */
public class Factura {
    
    Integer id;
    Integer idcliente;
    List<Integer> idproducto;

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", idcliente=" + idcliente + ", idproducto=" + idproducto + '}';
    }

    public Factura(Integer id, Integer idcliente, List<Integer> idproducto) {
        this.id = id;
        this.idcliente = idcliente;
        this.idproducto = idproducto;
    }

    public Factura() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public List<Integer> getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(List<Integer> idproducto) {
        this.idproducto = idproducto;
    }
    
}
