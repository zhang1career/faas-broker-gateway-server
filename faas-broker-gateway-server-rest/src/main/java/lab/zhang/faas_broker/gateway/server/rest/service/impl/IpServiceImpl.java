package lab.zhang.faas_broker.gateway.server.rest.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;
import lab.zhang.faas_broker.gateway.server.rest.entity.Ip;
import lab.zhang.faas_broker.gateway.server.rest.model.Address;
import lab.zhang.faas_broker.gateway.server.rest.service.IpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangrj
 */
@Service
@Slf4j
public class IpServiceImpl implements IpService {

    @Resource
    private LoadingCache<String, List<Ip>> ipCache;

    @Override
    public Address parse(DestDetail destDetail) {
        Address address = new Address();

        String domain = destDetail.getDomain();
        String path = destDetail.getPath();
        log.info("[parse] param domain:{}, path:{}", domain, path);

        List<Ip> ipList = ipCache.get(domain);
        if (CollUtil.isEmpty(ipList)) {
            log.info("[parse] no ipList found, domain:{}", domain);
            return address;
        }

        Ip ip = getPriorityItem(ipList);

        address.setIpv4(ip.getIp());
        address.setPort(ip.getPort());
        address.setUrl(path);

        return address;
    }

    /**
     * Get first item by priority
     *
     * @param ipList ip列表
     * @return ip
     */
    private static Ip getPriorityItem(List<Ip> ipList) {
        Ip ip = ipList.get(0);
        return ip;
    }
}
