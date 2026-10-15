package com.RodrigoAlmeida.sistema_reservas.exceptions;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(String message) {
        super(message);
    }
}
