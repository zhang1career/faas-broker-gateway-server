package lab.zhang.faas_broker.gateway.server.rest.service;

import lab.zhang.faas_broker.gateway.server.rest.dao.Dest;
import lab.zhang.faas_broker.gateway.server.rest.qo.DestQO;

/**
 * @author zhangrj
 */
public interface DestService {

    Dest findOne(DestQO destQO);
}
