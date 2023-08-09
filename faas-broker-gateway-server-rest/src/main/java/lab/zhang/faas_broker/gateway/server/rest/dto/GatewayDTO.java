package lab.zhang.faas_broker.gateway.server.rest.dto;

import lombok.Data;

import java.util.Map;

@Data
public class GatewayDTO {

    private Long appId;

    private Map<String, Object> param;
}
