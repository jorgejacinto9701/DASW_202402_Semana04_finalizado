package com.cibertec.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cibertec.entity.Cliente;
import com.cibertec.cibertec.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository repository;
    
    @Override
    public List<Cliente> listaCliente() {
            return repository.findAll();
    }
    
}
