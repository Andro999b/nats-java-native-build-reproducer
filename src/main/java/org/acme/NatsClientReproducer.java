package org.acme;

import io.nats.client.NUID;
import io.nats.client.Nats;
import io.nats.client.Options;
import io.nats.client.support.RandomUtils;
import io.quarkus.arc.log.LoggerName;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jboss.logging.Logger;

import java.io.IOException;

@QuarkusMain
public class NatsClientReproducer implements QuarkusApplication {
    @Inject
    Logger log;

    @Override
    public int run(String... args) throws Exception {
        log.info("SRAND: " + RandomUtils.SRAND.nextInt());
        log.info("PRAND: " + RandomUtils.PRAND.nextInt());
        log.info("NUID: " + NUID.nextGlobalSequence());
        return 0;
    }
}
