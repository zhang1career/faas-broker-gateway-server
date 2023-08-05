package lab.zhang.faas_broker.gateway.server.rest.model;

import lombok.Data;

@Data
public class Address {

    private String ipv4;

    private int port;

    public String url;
}
