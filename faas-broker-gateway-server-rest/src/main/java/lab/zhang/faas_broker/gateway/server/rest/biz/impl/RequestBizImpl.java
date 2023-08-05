package lab.zhang.faas_broker.gateway.server.rest.biz.impl;

import lab.zhang.faas_broker.gateway.server.rest.biz.RequestBiz;
import lab.zhang.faas_broker.gateway.server.rest.exception.GatewayException;
import lab.zhang.faas_broker.gateway.server.rest.model.Address;
import lab.zhang.faas_broker.gateway.server.rest.model.Domain;
import lab.zhang.faas_broker.gateway.server.rest.model.Response;
import lab.zhang.faas_broker.gateway.server.rest.service.DomainNameService;
import lab.zhang.faas_broker.gateway.server.rest.service.RouteService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangrj
 */
@Service
@Slf4j
public class RequestBizImpl implements RequestBiz {

    @Resource
    private RouteService routeService;

    @Resource
    private DomainNameService domainNameService;


    @Override
    public Response post(Long appId, Map<String, Object> paramMap) throws IOException {
        String uri = buildUri(appId);
        log.info("[post] uri:{}", uri);

        List<NameValuePair> params = new ArrayList<>();
        for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
            String paramName = entry.getKey();
            Object paramValue = entry.getValue();
            params.add(new BasicNameValuePair(paramName, paramValue.toString()));
        }

        HttpPost httppost = new HttpPost(uri);
        httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        HttpClient httpclient = HttpClients.createDefault();

        HttpResponse httpResponse = httpclient.execute(httppost);

        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            return null;
        }

        StatusLine statusLine = httpResponse.getStatusLine();
        if (statusLine == null) {
            throw new GatewayException("[post] statusLine of response is null");
        }
        Response response = new Response();
        response.setStatus(statusLine.getStatusCode());
        response.setData(EntityUtils.toString(entity, "UTF-8"));

        return response;
    }

    private String buildUri(Long appId) {
        Domain domain = routeService.route(appId);
        if (domain == null) {
            throw new GatewayException("[buildUri] domain is null");
        }

        Address address = domainNameService.parse(domain);
        if (address == null) {
            throw new GatewayException("[buildUri] address is null");
        }


        return "http://" + address.getIpv4() + ":" + address.getPort() + address.getUrl();
    }

}
