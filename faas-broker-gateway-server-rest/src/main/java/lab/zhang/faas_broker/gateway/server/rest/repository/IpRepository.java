package lab.zhang.faas_broker.gateway.server.rest.repository;

import lab.zhang.faas_broker.gateway.server.rest.entity.Ip;

import java.util.List;

/**
 * @author zhangrj
 */
public interface IpRepository {

    /**
     * 查询ip列表
     *
     * @param domain 域名
     * @return ip列表
     */
    List<Ip> findIpList(String domain);
}
