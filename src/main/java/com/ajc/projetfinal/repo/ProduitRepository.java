package com.ajc.projetfinal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajc.projetfinal.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
	List<Produit> findByNomContaining(String nom);
	List<Produit> findByPrixBetween(int min, int max);
	
}
