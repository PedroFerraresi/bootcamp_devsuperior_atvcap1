package com.devsuperior.atvcap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.atvcap1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
