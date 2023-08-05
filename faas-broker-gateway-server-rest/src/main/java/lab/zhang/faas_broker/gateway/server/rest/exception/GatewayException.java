package lab.zhang.faas_broker.gateway.server.rest.exception;

/**
 * @author zhangrj
 */
public class GatewayException extends RuntimeException {

    public GatewayException() {
        super();
    }

    public GatewayException(String message) {
        super(message);
    }

    public GatewayException(String message, Throwable cause) {
        super(message, cause);
    }

    public GatewayException(Throwable cause) {
        super(cause);
    }

}
