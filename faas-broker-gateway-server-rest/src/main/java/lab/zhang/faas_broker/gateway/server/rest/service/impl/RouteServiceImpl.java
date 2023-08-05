package lab.zhang.faas_broker.gateway.server.rest.service.impl;

import lab.zhang.faas_broker.gateway.server.rest.model.Domain;
import lab.zhang.faas_broker.gateway.server.rest.service.RouteService;
import org.springframework.stereotype.Service;

/**
 * @author zhangrj
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Override
    public Domain route(Long appId) {
        Domain domain = new Domain();
        domain.setDomainName("rule-engine");

        return domain;
    }
}
