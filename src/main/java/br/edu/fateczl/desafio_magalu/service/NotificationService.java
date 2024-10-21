package br.edu.fateczl.desafio_magalu.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.fateczl.desafio_magalu.controller.dto.ScheduleNotificationDto;
import br.edu.fateczl.desafio_magalu.entities.Notification;
import br.edu.fateczl.desafio_magalu.entities.Status;
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

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotification(Long notificationId) {
        var notification = findById(notificationId);

        if (notification.isPresent()) {
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }

}
