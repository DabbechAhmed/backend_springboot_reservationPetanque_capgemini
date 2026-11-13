package dev.capgemini.backend.springboot.repository;

import dev.capgemini.backend.springboot.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

}
