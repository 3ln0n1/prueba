package com.prueba.prueba.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.models.ClienteDO;
import com.prueba.prueba.services.ClienteServices;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("cliente")
public class ClienteController {
    
    @Autowired
    ClienteServices clienteService;

   

    @PostMapping("/add")
    public ClienteDO saveClient(@RequestBody ClienteDO cliente){
        return this.clienteService.saveClient(cliente);
    }

    @GetMapping("/clientes")
    public ArrayList<ClienteDO> allClients(){
        return clienteService.allClients();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable ("id") Long id){
        this.clienteService.deleteClient(id);
    }
    
}
