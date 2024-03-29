package com.proyecto.Clientes.Interfaces;

import java.util.List;

public interface IntCliente<Cliente> {
    Cliente Crear(String pNombre, String sNombre, String pApellido, String sApellido, String Nit);
    Cliente BuscarId(Integer id);
    void Eliminar(Integer id);
    Cliente Actualizar(Cliente cliente);
    List<Cliente> Obtenertodos();
}
