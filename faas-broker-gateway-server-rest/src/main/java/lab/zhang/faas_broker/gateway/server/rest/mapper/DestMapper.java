package lab.zhang.faas_broker.gateway.server.rest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lab.zhang.faas_broker.gateway.server.rest.entity.Dest;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;

/**
 * @author zhangrj
 */
public interface DestMapper extends BaseMapper<Dest> {

    DestDetail getDestDetailById(Long id);

}
