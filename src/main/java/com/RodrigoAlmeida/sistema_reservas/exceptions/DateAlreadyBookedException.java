package com.RodrigoAlmeida.sistema_reservas.exceptions;

public class DateAlreadyBookedException extends RuntimeException {
    public DateAlreadyBookedException(String message) {
        super(message);
    }
}
