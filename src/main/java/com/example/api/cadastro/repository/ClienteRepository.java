package com.example.api.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<com.example.api.cadastro.Model.Cliente, Integer> {
}
