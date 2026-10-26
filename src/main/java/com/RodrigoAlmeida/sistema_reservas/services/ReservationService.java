package com.RodrigoAlmeida.sistema_reservas.services;

import com.RodrigoAlmeida.sistema_reservas.entities.Client;
import com.RodrigoAlmeida.sistema_reservas.entities.Reservation;
import com.RodrigoAlmeida.sistema_reservas.exceptions.DateAlreadyBookedException;
import com.RodrigoAlmeida.sistema_reservas.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ClientService clientService;

    public Reservation save(Reservation reservation){
        Long clienteId = reservation.getClient().getId();
        Client clienteDoBanco = clientService.findById(clienteId);
        reservation.setClient(clienteDoBanco);
        if (reservationRepository.existsByDate(reservation.getDate())){
            throw new DateAlreadyBookedException("There is already a reservation for this date");
        }
            return reservationRepository.save(reservation);
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
}
