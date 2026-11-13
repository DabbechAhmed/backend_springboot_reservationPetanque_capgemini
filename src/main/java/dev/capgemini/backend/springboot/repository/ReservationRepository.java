package dev.capgemini.backend.springboot.repository;

import dev.capgemini.backend.springboot.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
