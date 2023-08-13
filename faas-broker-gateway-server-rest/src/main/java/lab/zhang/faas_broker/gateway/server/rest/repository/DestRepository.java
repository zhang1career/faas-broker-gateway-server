package lab.zhang.faas_broker.gateway.server.rest.repository;

import lab.zhang.faas_broker.gateway.server.rest.dto.DestDTO;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;

/**
 * @author zhangrj
 */
public interface DestRepository {

    /**
     * 查询路由目标的详情
     *
     * @param destDTO 查询参数
     * @return 路由目标的详情
     */
    DestDetail findDestDetail(DestDTO destDTO);
}
