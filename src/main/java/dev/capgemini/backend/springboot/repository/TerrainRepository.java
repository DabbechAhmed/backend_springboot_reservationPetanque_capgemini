package dev.capgemini.backend.springboot.repository;

import dev.capgemini.backend.springboot.entity.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrainRepository extends JpaRepository<Terrain,Integer> {
}
