package com.RodrigoAlmeida.sistema_reservas.repositories;

import com.RodrigoAlmeida.sistema_reservas.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    boolean existsByDate(LocalDate date);

}
