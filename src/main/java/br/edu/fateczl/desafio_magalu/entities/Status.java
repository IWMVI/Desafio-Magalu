package br.edu.fateczl.desafio_magalu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_status")
@Getter
@Setter
@NoArgsConstructor
public class Status {

    public Status(Long statusId, String description) {
        this.statusId = statusId;
        this.description = description;
    }

    @Id
    private Long statusId;

    private String description;

    public enum Values {
        PENDING(1L, "pending"),
        SUCCESS(2L, "success"),
        ERROR(3L, "error"),
        CANCELED(4L, "canceled");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Status toStatus() {
            return new Status(id, description);
        }
    }
}
