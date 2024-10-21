package br.edu.fateczl.desafio_magalu.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.desafio_magalu.entities.Notification;
import br.edu.fateczl.desafio_magalu.entities.Status.Values;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByStatusInAndDateTimeBefore(List<Values> list, LocalDateTime dateTime);
}
