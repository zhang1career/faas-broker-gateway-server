package lab.zhang.faas_broker.gateway.server.rest.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangrj
 */
@Configuration
@MapperScan("lab.zhang.faas_broker.gateway.server.rest.mapper")
public class MybatisPlusConfig {
}
