package com.prueba.prueba.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.models.ClienteDO;
import com.prueba.prueba.repository.ClienteRepository;

@Service
public class ClienteServices {
    
    @Autowired
    ClienteRepository clienteRepository;



    public ClienteDO saveClient(ClienteDO cliente){
        return clienteRepository.save(cliente);
    }

    public ArrayList<ClienteDO> allClients(){
        return (ArrayList<ClienteDO>) clienteRepository.findAll();

    }

    public void deleteClient(Long id){
        clienteRepository.deleteById(id);
    }
}
