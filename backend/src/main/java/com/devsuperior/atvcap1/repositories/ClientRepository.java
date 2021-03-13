package com.devsuperior.atvcap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.atvcap1.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
