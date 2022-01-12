package com.ajc.projetfinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajc.projetfinal.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

	
}
