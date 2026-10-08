package pizzaria;

public class PedidoEstadoPreparando extends PedidoEstado{

    private PedidoEstadoPreparando() {};
    private static PedidoEstadoPreparando instance = new PedidoEstadoPreparando();
    public static PedidoEstadoPreparando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean viajar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        return true;
    }

}
