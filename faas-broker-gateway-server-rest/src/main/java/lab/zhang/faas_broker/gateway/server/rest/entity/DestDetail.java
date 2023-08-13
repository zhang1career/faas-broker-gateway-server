package lab.zhang.faas_broker.gateway.server.rest.entity;

import lombok.Data;

/**
 * @author zhangrj
 */
@Data
public class DestDetail {

    private long id;

    private int protocol;

    private int method;

    private int domainId;

    private String domain;

    private String path;

    private long createTime;

    private long updateTime;
}
