package lab.zhang.faas_broker.gateway.server.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangrj
 */
@SpringBootApplication
@Slf4j
public class FaasBrokerGatewayRestApplication {

    public static void main(String[] args) {
        log.info("[main] rule-engine rest starting...");
        SpringApplication.run(FaasBrokerGatewayRestApplication.class, args);
        log.info("[main] rule-engine rest started");
    }

}