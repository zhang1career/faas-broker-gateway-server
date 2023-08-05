package lab.zhang.faas_broker.gateway.server.rest.controller;

import lab.zhang.faas_broker.gateway.server.rest.biz.RequestBiz;
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
    public Response req(@RequestParam Map<String, Object> param) {

        long appId = 10000001L;

        Response response = new Response();
        try {
            response = requestBiz.post(appId, param);
        } catch (Exception e) {
            log.error("[req] request failed", e);
        }

        return response;
    }
}
