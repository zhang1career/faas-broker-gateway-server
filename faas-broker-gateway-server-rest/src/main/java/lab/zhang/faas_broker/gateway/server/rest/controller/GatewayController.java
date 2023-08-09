package lab.zhang.faas_broker.gateway.server.rest.controller;

import lab.zhang.faas_broker.gateway.server.rest.biz.RequestBiz;
import lab.zhang.faas_broker.gateway.server.rest.dto.GatewayDTO;
import lab.zhang.faas_broker.gateway.server.rest.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zhangrj
 */
@RestController
@RequestMapping("gateway")
@Slf4j
public class GatewayController {

    @Resource
    private RequestBiz requestBiz;


    @RequestMapping(method = RequestMethod.POST, value = "/req")
    @ResponseBody
    public Response req(@RequestBody GatewayDTO gatewayDTO) {

        Long appId = gatewayDTO.getAppId();
        Map<String, Object> param = gatewayDTO.getParam();
        param.put("rule", "{\"name\":\"大于\",\"type\":\"OP_GT\",\"value\":[{\"name\":\"年龄\",\"type\":\"VAR_INT\",\"value\":\"age\"},{\"name\":\"18\",\"type\":\"INS_INT\",\"value\":\"18\"}]}");

        Response response = new Response();
        try {
            response = requestBiz.post(appId, param);
        } catch (Exception e) {
            log.error("[req] request failed", e);
        }

        return response;
    }
}
