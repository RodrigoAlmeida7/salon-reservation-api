package com.RodrigoAlmeida.sistema_reservas.Controllers;

import com.RodrigoAlmeida.sistema_reservas.entities.Client;
import com.RodrigoAlmeida.sistema_reservas.entities.Reservation;
import com.RodrigoAlmeida.sistema_reservas.services.ReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    private Client client;

    @PostMapping
    public ResponseEntity<Reservation> save(@Valid @RequestBody Reservation reservation) {
        Reservation savedReservation = reservationService.save(reservation);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedReservation);
    }

    @GetMapping
    public List<Reservation> findAll(){
        return reservationService.findAll();
    }
}
