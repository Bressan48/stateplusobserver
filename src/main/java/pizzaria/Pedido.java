package pizzaria;

import java.util.Observable;

public class Pedido extends Observable{

    private String nome;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRegistrado.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public boolean registrar() {
        return estado.registrar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean recusar() {
        return estado.recusar(this);
    }

    public boolean viajar() {
        return estado.viajar(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "estado atual=" + estado.getEstado() +
                '}';
    }

}
