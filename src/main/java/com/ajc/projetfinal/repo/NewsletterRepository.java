package com.ajc.projetfinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajc.projetfinal.model.Newsletter;

public interface NewsletterRepository extends JpaRepository<Newsletter, String> {

}
