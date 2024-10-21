package br.edu.fateczl.desafio_magalu.service;

import org.springframework.stereotype.Service;

import br.edu.fateczl.desafio_magalu.controller.dto.ScheduleNotificationDto;
import br.edu.fateczl.desafio_magalu.repository.NotificationRepository;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

}
