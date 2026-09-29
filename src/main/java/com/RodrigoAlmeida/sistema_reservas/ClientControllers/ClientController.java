package com.RodrigoAlmeida.sistema_reservas.ClientControllers;

import com.RodrigoAlmeida.sistema_reservas.entities.Client;
import com.RodrigoAlmeida.sistema_reservas.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping
    public ResponseEntity<Client> save(@Valid @RequestBody Client client) {
        Client savedClient = clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClient);
    }
    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }
}
