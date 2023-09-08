package br.com.one.hotelalura.model;

import br.com.one.hotelalura.constraints.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Reserva {
    private Long reservationId;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private BigDecimal value;
    private PaymentMethod paymentMethod;
}
