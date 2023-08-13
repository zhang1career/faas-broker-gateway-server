package lab.zhang.faas_broker.gateway.server.rest.service;

import lab.zhang.faas_broker.gateway.server.rest.model.Address;

/**
 * @author zhangrj
 */
public interface DomainNameParseService {

    Address parse(String domain, String path);
}
