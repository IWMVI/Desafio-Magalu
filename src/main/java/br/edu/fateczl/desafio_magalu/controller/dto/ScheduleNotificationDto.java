package br.edu.fateczl.desafio_magalu.controller.dto;

// import the correct package for Channel
import java.time.LocalDate;
import java.time.LocalDateTime;

import br.edu.fateczl.desafio_magalu.entities.Notification;
import br.edu.fateczl.desafio_magalu.entities.Status;
import br.edu.fateczl.desafio_magalu.entities.Channel.Values;

public record ScheduleNotificationDto(LocalDate dateTime, String destination, String message, Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus());
    }
}
