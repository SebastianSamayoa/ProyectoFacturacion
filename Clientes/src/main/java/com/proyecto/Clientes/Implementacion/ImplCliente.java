package com.proyecto.Clientes.Implementacion;

import com.proyecto.Clientes.Interfaces.GeneralInterfaces;
import com.proyecto.Clientes.Objeto.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ImplCliente implements GeneralInterfaces<Cliente> {

    List<Cliente> LC = new ArrayList<>();

    @PostMapping(value = "/cliente/crear",consumes = "application/json")
    @Override
    public void Crear(@RequestBody  Cliente cliente) {
        try {
            cliente.setId(LC.size());
            LC.add(cliente);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Editar(Cliente cliente) {

    }

    @Override
    public void Eliminar(Integer Id) {

    }

    @Override
    public Cliente Buscar(Integer Id) {
        return null;
    }

    @GetMapping(value = "/cliente/all",produces = "application/json")
    @Override
    public List<Cliente> ObtenerTodos() {
        return LC;
    }
}
