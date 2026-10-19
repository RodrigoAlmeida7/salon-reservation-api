package com.RodrigoAlmeida.sistema_reservas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @FutureOrPresent(message = "A data da reserva não pode ser no passado")
    @NotNull(message = "A data da reserva é obrigatória")
    private LocalDate date;
    @NotNull @Positive BigDecimal chargedValue;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @NotNull Client client;

    public Reservation() {
    }

    public Reservation(Long id, LocalDate date, BigDecimal chargedValue, Client client) {
        this.id = id;
        this.date = date;
        this.chargedValue = chargedValue;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getChargedValue() {
        return chargedValue;
    }

    public void setChargedValue(BigDecimal chargedValue) {
        this.chargedValue = chargedValue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
