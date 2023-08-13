package lab.zhang.faas_broker.gateway.server.rest.service.impl;

import lab.zhang.faas_broker.gateway.server.rest.model.Address;
import lab.zhang.faas_broker.gateway.server.rest.service.DomainNameParseService;
import org.springframework.stereotype.Service;

/**
 * @author zhangrj
 */
@Service
public class DomainNameParseServiceImpl implements DomainNameParseService {
    @Override
    public Address parse(String domain, String path) {
        Address address = new Address();
        address.setIpv4("54.86.102.80");
        address.setPort(10001);
        address.setUrl(path);

        return address;
    }
}
