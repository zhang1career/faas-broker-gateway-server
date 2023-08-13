package lab.zhang.faas_broker.gateway.server.rest.service.impl;

import lab.zhang.faas_broker.gateway.server.rest.dto.DestDTO;
import lab.zhang.faas_broker.gateway.server.rest.entity.DestDetail;
import lab.zhang.faas_broker.gateway.server.rest.repository.DestRepository;
import lab.zhang.faas_broker.gateway.server.rest.service.DestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class DestServiceImpl implements DestService {

    @Resource
    private DestRepository destRepository;

    @Override
    public DestDetail findDestDetail(Long appId) {
        DestDTO destDTO = new DestDTO();
        destDTO.setId(appId);
        DestDetail dest = destRepository.findDestDetail(destDTO);
        return dest;
    }
}
