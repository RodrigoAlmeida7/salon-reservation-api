package com.RodrigoAlmeida.sistema_reservas.services;
import com.RodrigoAlmeida.sistema_reservas.entities.Client;
import com.RodrigoAlmeida.sistema_reservas.exceptions.DuplicateEmailException;
import com.RodrigoAlmeida.sistema_reservas.repositories.ClientRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public Client save(Client client){
        if (clientRepository.existsByEmail(client.getEmail())){
            throw new DuplicateEmailException("E-mail já cadastrado: "+ client.getEmail());
        }
        return clientRepository.save(client);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public ClientRepository getClientRepository() {
        return clientRepository;
    }
}
