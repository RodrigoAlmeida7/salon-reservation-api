package com.RodrigoAlmeida.sistema_reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.RodrigoAlmeida.sistema_reservas.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    boolean existsByEmail(String email);
}
