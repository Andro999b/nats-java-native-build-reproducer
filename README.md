# Nats Client Native build fails Reproducer

Nats client will fail in native build due to `net.i2p.crypto:eddsa:0.3.0`

Run to test:
```shell
./mvnw clean package -Dnative
```