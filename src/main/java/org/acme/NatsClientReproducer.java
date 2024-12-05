package org.acme;

import io.nats.client.Nats;
import io.nats.client.Options;
import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;

import java.io.IOException;

@Startup
@Singleton
public class NatsClientReproducer {
    @PostConstruct
    void reproduce() throws IOException, InterruptedException {
        final var options = Options.builder().build();
        Nats.connect(options);
    }
}
