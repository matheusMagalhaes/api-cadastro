package com.example.api.cadastro.serviceImpl;

import com.example.api.cadastro.Model.Cliente;
import com.example.api.cadastro.Service.ClienteService;
import com.example.api.cadastro.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {


    public ClienteServiceImpl( ClienteRepository repository){
        this.repository = repository;
    }

    private ClienteRepository repository;

    @Override
    public List<Cliente> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Cliente saveEntity(Cliente cliente) {
        return this.repository.saveAndFlush(cliente);
    }


}
