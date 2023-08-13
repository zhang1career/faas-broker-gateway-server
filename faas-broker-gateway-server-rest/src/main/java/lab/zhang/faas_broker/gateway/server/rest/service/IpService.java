package lab.zhang.faas_broker.gateway.server.rest.service;

import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;
import lab.zhang.faas_broker.gateway.server.rest.model.Address;

/**
 * @author zhangrj
 */
public interface IpService {

    Address parse(DestDetail destDetail);
}
