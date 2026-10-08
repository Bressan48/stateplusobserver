package pizzaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Cliente 1");
        cliente.realizarPedido(pedido);
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertEquals("Cliente 1, pedido lançado no Pedido{estado atual=Registrado}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Pedido pedido = new Pedido();
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.realizarPedido(pedido);
        cliente2.realizarPedido(pedido);
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertEquals("Cliente 1, pedido lançado no Pedido{estado atual=Registrado}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, pedido lançado no Pedido{estado atual=Registrado}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Cliente 1");
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientePedidoA() {
        Pedido pedidoA = new Pedido();
        Pedido pedidoB = new Pedido();
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.realizarPedido(pedidoA);
        cliente2.realizarPedido(pedidoB);
        pedidoA.setEstado(PedidoEstadoRegistrado.getInstance());
        assertEquals("Cliente 1, pedido lançado no Pedido{estado atual=Registrado}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }

}
