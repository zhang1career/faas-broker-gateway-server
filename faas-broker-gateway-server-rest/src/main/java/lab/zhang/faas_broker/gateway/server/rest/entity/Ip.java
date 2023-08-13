package lab.zhang.faas_broker.gateway.server.rest.entity;

import lombok.Data;

/**
 * @author zhangrj
 */
@Data
public class Ip {

    private long id;

    private String domain;

    private String ip;

    private int port;

    private long createTime;

    private long updateTime;
}
