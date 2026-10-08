package pizzaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido registrado

    @Test
    public void naoDeveRegistrarPedidoRegistrado() {
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertFalse(pedido.registrar());
    }

    @Test
    public void devePrepararPedidoRegistrado() {
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoPreparando.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoRegistrado() {
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveViajarPedidoRegistrado() {
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertFalse(pedido.viajar());
    }

    @Test
    public void naoDeveRecusarPedidoRegistrado() {
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertFalse(pedido.recusar());
    }

    @Test
    public void naoDeveEntregarPedidoRegistrado() {
        pedido.setEstado(PedidoEstadoRegistrado.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido cancelado

    @Test
    public void naoDeveRegistrarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.registrar());
    }

    @Test
    public void naoDevePrepararPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveViajarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.viajar());
    }

    @Test
    public void naoDeveRecusarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.recusar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido Preparando

    @Test
    public void naoDeveRegistrarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.registrar());
    }

    @Test
    public void naoDevePrepararPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void deveCancelarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveViajarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertTrue(pedido.viajar());
        assertEquals(PedidoEstadoViajando.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveRecusarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.recusar());
    }

    @Test
    public void naoDeveEntregarPedidoPreparando() {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido Viajando

    @Test
    public void naoDeveRegistrarPedidoViajando() {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        assertFalse(pedido.registrar());
    }

    @Test
    public void naoDevePrepararPedidoViajando() {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveCancelarPedidoViajando() {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveViajarPedidoViajando() {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        assertFalse(pedido.viajar());
    }

    @Test
    public void deveRecusarPedidoViajando() {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        assertTrue(pedido.recusar());
        assertEquals(PedidoEstadoRecusado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEntregarPedidoViajando() {
        pedido.setEstado(PedidoEstadoViajando.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());

    }

    // Pedido recusado

    @Test
    public void naoDeveRegistrarPedidoRecusado() {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        assertFalse(pedido.registrar());
    }

    @Test
    public void naoDevePrepararPedidoRecusado() {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveCancelarPedidoRecusado() {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveViajarPedidoRecusado() {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        assertFalse(pedido.viajar());
    }

    @Test
    public void naoDeveRecusarPedidoRecusado() {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        assertFalse(pedido.recusar());
    }

    @Test
    public void naoDeveEntregarPedidoRecusado() {
        pedido.setEstado(PedidoEstadoRecusado.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido Entregue

    @Test
    public void naoDeveRegistrarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.registrar());
    }

    @Test
    public void naoDevePrepararPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveViajarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.viajar());
    }

    @Test
    public void naoDeveRecusarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.recusar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

}
