package com.example.api.cadastro.Service;

import com.example.api.cadastro.Model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();

    Cliente saveEntity(Cliente cliente);
}
