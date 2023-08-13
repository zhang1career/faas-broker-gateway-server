package lab.zhang.faas_broker.gateway.server.rest.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.zhang.faas_broker.gateway.server.rest.dto.DestDTO;
import lab.zhang.faas_broker.gateway.server.rest.entity.Dest;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;
import lab.zhang.faas_broker.gateway.server.rest.mapper.DestMapper;
import lab.zhang.faas_broker.gateway.server.rest.repository.DestRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhangrj
 */
@Repository
public class DestRepositoryImpl extends ServiceImpl<DestMapper, Dest> implements DestRepository {

    @Override
    public DestDetail findOne(DestDTO destDTO) {
        return baseMapper.getDestDetailById(destDTO.getId());
    }
}
