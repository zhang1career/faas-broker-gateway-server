package lab.zhang.faas_broker.gateway.server.rest.entity;

import lombok.Data;

/**
 * @author zhangrj
 */
@Data
public class Dest {

    private long id;

    private int protocol;

    private int method;

    private int domainId;

    private String path;

    private long createTime;

    private long updateTime;
}
