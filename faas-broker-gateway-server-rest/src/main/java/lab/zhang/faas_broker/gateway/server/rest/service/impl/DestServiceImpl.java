package lab.zhang.faas_broker.gateway.server.rest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.zhang.faas_broker.gateway.server.rest.dao.Dest;
import lab.zhang.faas_broker.gateway.server.rest.qo.DestQO;
import lab.zhang.faas_broker.gateway.server.rest.mapper.DestMapper;
import lab.zhang.faas_broker.gateway.server.rest.service.DestService;

/**
 * @author zhangrj
 */
public class DestServiceImpl extends ServiceImpl<DestMapper, Dest> implements DestService {

    @Override
    public Dest findOne(DestQO destQO) {
        return lambdaQuery()
                .like(destQO.getId() > 0, Dest::getId, destQO.getId())
                .one();
    }
}
