package lab.zhang.faas_broker.gateway.server.rest.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.zhang.faas_broker.gateway.server.rest.entity.Ip;
import lab.zhang.faas_broker.gateway.server.rest.mapper.IpMapper;
import lab.zhang.faas_broker.gateway.server.rest.repository.IpRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IpRepositoryImpl extends ServiceImpl<IpMapper, Ip> implements IpRepository {

    @Override
    public List<Ip> findIpList(String domain) {
        return lambdaQuery()
                .eq(Ip::getDomain, domain)
                .list();
    }
}
