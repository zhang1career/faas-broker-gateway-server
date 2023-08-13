package lab.zhang.faas_broker.gateway.server.rest.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;
import lab.zhang.faas_broker.gateway.server.rest.entity.Ip;
import lab.zhang.faas_broker.gateway.server.rest.repository.IpRepository;
import lab.zhang.faas_broker.gateway.server.rest.service.DestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangrj
 */
@Configuration
public class CacheConfig {

    @Resource
    private DestService destService;

    @Resource
    IpRepository ipRepository;


    @Bean
    public LoadingCache<Long, DestDetail> destDetailCache() {
        LoadingCache<Long, DestDetail> cache = Caffeine.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .build(appId -> destService.findDestDetail(appId));

        return cache;
    }

    @Bean
    public LoadingCache<String, List<Ip>> ipCache() {
        LoadingCache<String, List<Ip>> cache = Caffeine.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .build(domain -> ipRepository.findIpList(domain));

        return cache;
    }
}
