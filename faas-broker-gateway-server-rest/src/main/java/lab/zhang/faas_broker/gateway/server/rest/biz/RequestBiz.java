package lab.zhang.faas_broker.gateway.server.rest.biz;

import lab.zhang.faas_broker.gateway.server.rest.model.Response;

import java.io.IOException;
import java.util.Map;

/**
 * @author zhangrj
 */
public interface RequestBiz {

    Response post(Long appId, Map<String, Object> param) throws IOException;

}
