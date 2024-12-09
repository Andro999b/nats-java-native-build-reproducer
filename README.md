# Native Build with Quarkus and Java Nats Client 

To build run command:
```shell
./mvnw clean package -Dnative
```

To execute: 
```shell
target/native-build-1.0.0-SNAPSHOT-runner
```

GraalVM options explains:

* `-J--add-exports=java.base/sun.security.x509=ALL-UNNAMED` -  export proprietary `sun` api, quarkus native build plugin does not do this by default (required for `net.i2p.crypto:eddsa:0.3.0`)  
* `--initialize-at-run-time=io.nats.client.support.RandomUtil`,`--initialize-at-run-time=java.security.SecureRandom` - Force runtime class initialization for RNG.  
* `--initialize-at-run-time=io.nats.client.NUID` - Force  runtime class initialization for a name generator, otherwise anonymous consumers(like KV watchers) always will have the same name.  