package lab.zhang.faas_broker.gateway.server.rest;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zhangrj
 */
@SpringBootApplication(
        scanBasePackages = {
                "lab.zhang.faas_broker.gateway.server.rest"
        },
        exclude = {
                DataSourceAutoConfiguration.class
        })
@MapperScan("lab.zhang.faas_broker.gateway.server.rest.mapper")
@Slf4j
public class FaasBrokerGatewayRestApplication {

    public static void main(String[] args) {
        log.info("[main] rule-engine rest starting...");
        try {
            SpringApplication.run(FaasBrokerGatewayRestApplication.class, args);
        } catch (Exception e) {
            log.error("[main] error", e);
        }
        log.info("[main] rule-engine rest started");
    }

}