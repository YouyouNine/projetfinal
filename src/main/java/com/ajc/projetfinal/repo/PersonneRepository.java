package com.ajc.projetfinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajc.projetfinal.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, String> {

	Personne findByUsernameAndPassword(String username, String password);
	Personne findByUsername(String username);
}
