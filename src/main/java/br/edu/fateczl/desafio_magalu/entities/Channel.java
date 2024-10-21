package br.edu.fateczl.desafio_magalu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_channel")
@Getter
@Setter
@NoArgsConstructor
public class Channel {

    @Id
    private Long channelId;

    private String description;

}
