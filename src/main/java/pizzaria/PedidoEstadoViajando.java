package pizzaria;

public class PedidoEstadoViajando extends PedidoEstado {

    private PedidoEstadoViajando() {};
    private static PedidoEstadoViajando instance = new PedidoEstadoViajando();
    public static PedidoEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Viajando";
    }

    public boolean recusar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        return true;
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

}
