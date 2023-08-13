package lab.zhang.faas_broker.gateway.server.rest.repository;

import lab.zhang.faas_broker.gateway.server.rest.dto.DestDTO;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;

/**
 * @author zhangrj
 */
public interface DestRepository {

    DestDetail findOne(DestDTO destDTO);
}
