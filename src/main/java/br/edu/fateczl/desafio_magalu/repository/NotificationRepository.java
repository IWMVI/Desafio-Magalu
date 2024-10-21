package br.edu.fateczl.desafio_magalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.desafio_magalu.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
