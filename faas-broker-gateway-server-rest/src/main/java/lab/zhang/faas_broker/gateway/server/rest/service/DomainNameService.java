package lab.zhang.faas_broker.gateway.server.rest.service;

import lab.zhang.faas_broker.gateway.server.rest.model.Address;
import lab.zhang.faas_broker.gateway.server.rest.model.Domain;

/**
 * @author zhangrj
 */
public interface DomainNameService {

    Address parse(Domain domain, String path);
}
