package com.ajc.projetfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.ajc.projetfinal.repo.PersonneRepository;


@Service
public class ConsoleService implements CommandLineRunner {
	
	@Autowired
	PersonneRepository repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("coucou projet boot");
		System.out.println(repo.findAll());

	}
}
