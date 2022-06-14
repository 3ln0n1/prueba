package com.prueba.prueba.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.models.ClienteDO;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDO, Long> {

   
}
