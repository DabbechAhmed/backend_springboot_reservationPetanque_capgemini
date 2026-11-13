package dev.capgemini.backend.springboot.repository;

import dev.capgemini.backend.springboot.entity.Coordonnees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordonneesRepository extends JpaRepository<Coordonnees,Integer> {
}
