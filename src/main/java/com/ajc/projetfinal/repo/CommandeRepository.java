package com.ajc.projetfinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajc.projetfinal.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}
