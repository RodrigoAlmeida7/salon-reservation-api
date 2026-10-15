package com.RodrigoAlmeida.sistema_reservas.repositories;

import com.RodrigoAlmeida.sistema_reservas.entities.Client;
import com.RodrigoAlmeida.sistema_reservas.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
