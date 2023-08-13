package lab.zhang.faas_broker.gateway.server.rest.service;

import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;

public interface DestService {

    DestDetail findDestDetail(Long appId);
}
