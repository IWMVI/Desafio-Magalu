package br.edu.fateczl.desafio_magalu.config;

import br.edu.fateczl.desafio_magalu.entities.Status;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.fateczl.desafio_magalu.entities.Channel;
import br.edu.fateczl.desafio_magalu.repository.ChannelRepository;
import br.edu.fateczl.desafio_magalu.repository.StatusRepository;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ChannelRepository channelRepository;
    private final StatusRepository statusRepository;

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.Values.values()).map(Channel.Values::toChannel).forEach(channelRepository::save);

        Arrays.stream(Status.Values.values()).map(Status.Values::toStatus).forEach(statusRepository::save);
    }
}
