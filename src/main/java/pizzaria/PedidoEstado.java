package pizzaria;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean registrar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }

    public boolean recusar(Pedido pedido) {
        return false;
    }

    public boolean viajar(Pedido pedido) {
        return false;
    }

    public boolean preparar(Pedido pedido) {
        return false;
    }

}
