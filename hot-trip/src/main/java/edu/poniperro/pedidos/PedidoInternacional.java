package edu.poniperro.pedidos;

import edu.poniperro.interfaces.Pedido;

public class PedidoInternacional implements Pedido{

    // private final String id;
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    // public String getId() {
    //     return this.id;
    // }

    @Override
    public String destino() {
        return this.destino;
    }

    @Override
    public int peso() {
        return this.peso;
    }
}
