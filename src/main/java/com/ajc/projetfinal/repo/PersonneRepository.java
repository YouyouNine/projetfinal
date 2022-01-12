package com.ajc.projetfinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajc.projetfinal.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, String> {
//	List<Personne> findByNom(String nom);
	//List<Personne> findByNomContaining(String nom);
//	List<Personne> findAllByOrderByNomAsc();
	Personne findByUsernameAndPassword(String username, String password);
	//Personne findBy
}
