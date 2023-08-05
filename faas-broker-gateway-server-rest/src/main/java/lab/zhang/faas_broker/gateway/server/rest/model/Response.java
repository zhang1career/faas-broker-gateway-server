package lab.zhang.faas_broker.gateway.server.rest.model;

import lombok.Data;

import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangrj
 */
@Data
public class Response {

    private int status;

    private String data;

    public Response() {
        this.status = HttpServletResponse.SC_NOT_FOUND;
        this.data = "";
    }
}
