package pizzaria;

public class PedidoEstadoRegistrado extends PedidoEstado {

    private PedidoEstadoRegistrado() {};
    private static PedidoEstadoRegistrado instance = new PedidoEstadoRegistrado();
    public static PedidoEstadoRegistrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Registrado";
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        return true;
    }

}
