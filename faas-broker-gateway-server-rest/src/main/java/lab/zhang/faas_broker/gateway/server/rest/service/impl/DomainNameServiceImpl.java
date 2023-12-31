package lab.zhang.faas_broker.gateway.server.rest.service.impl;

import lab.zhang.faas_broker.gateway.server.rest.model.Address;
import lab.zhang.faas_broker.gateway.server.rest.model.Domain;
import lab.zhang.faas_broker.gateway.server.rest.service.DomainNameService;
import org.springframework.stereotype.Service;

@Service
public class DomainNameServiceImpl implements DomainNameService {
    @Override
    public Address parse(Domain domain) {
        Address address = new Address();
        address.setIpv4("54.86.102.80");
        address.setPort(10001);
        address.setUrl("/rule/eval");

        return address;
    }
}
