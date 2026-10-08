package pizzaria;

public class PedidoEstadoRecusado extends PedidoEstado{

    private PedidoEstadoRecusado() {};
    private static PedidoEstadoRecusado instance = new PedidoEstadoRecusado();
    public static PedidoEstadoRecusado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recusado";
    }

}
