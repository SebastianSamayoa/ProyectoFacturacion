package com.proyecto.Clientes.Impl;

import com.proyecto.Clientes.Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ImplCliente implements IntCliente<Cliente> {

    List<Cliente> ListaClientes;

    public ImplCliente() {
        ListaClientes = new ArrayList<>();
    }

    @Override
    public void Crear(String pNombre, String sNombre, String pApellido, String sApellido, String Nit) {
        try {
            Cliente cliente = new Cliente(ListaClientes.size(),pNombre,sNombre,pApellido,sApellido,Nit);
            ListaClientes.add(cliente);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Cliente BuscarId(Integer id) {
        try {
            for (Cliente cli: ListaClientes) {
                if(cli.getId() == id) return cli;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void Eliminar(Integer id) {
    try {
        for (Cliente cli: ListaClientes) {
            if(cli.getId() == id) ListaClientes.remove(id);
        }
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    }
    }

    @Override
    public Cliente Actualizar(Cliente o) {
        try {
            for (Cliente cli: ListaClientes) {
                if(cli.equals(o)){
                    ListaClientes.remove(cli.getId());
                    ListaClientes.add(o);
                };
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public List<Cliente> Obtenertodos() {
        return ListaClientes;
    }
}
