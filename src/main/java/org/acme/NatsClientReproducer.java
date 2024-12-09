package org.acme;

import io.nats.client.NUID;
import io.nats.client.Nats;
import io.nats.client.Options;
import io.nats.client.support.RandomUtils;
import io.quarkus.arc.log.LoggerName;
import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jboss.logging.Logger;

import java.io.IOException;

@Startup
@Singleton
public class NatsClientReproducer {
    @Inject
    Logger log;

    @PostConstruct
    void reproduce() throws IOException, InterruptedException {
        log.info("SRAND: " + RandomUtils.SRAND.nextInt());
        log.info("PRAND: " + RandomUtils.PRAND.nextInt());
        log.info("NUID: " + NUID.nextGlobalSequence());
    }
}
