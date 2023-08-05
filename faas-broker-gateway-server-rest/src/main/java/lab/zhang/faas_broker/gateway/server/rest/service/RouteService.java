package lab.zhang.faas_broker.gateway.server.rest.service;

import lab.zhang.faas_broker.gateway.server.rest.model.Domain;

public interface RouteService {

    Domain route(Long appId);
}
