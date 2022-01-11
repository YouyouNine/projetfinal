package com.ajc.projetfinal.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ajc.projetfinal.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, String> {
//	List<Personne> findByNom(String nom);
	List<Personne> findByNomContaining(String nom);
//	List<Personne> findAllByOrderByNomAsc();
}
