package edu.poniperro.pedidos;

import java.util.UUID;

import edu.poniperro.interfaces.Pedido;

public class PedidoNacional implements Pedido{

    private final String id = UUID.randomUUID().toString();
    private String destino;
    private int peso;

    public PedidoNacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    public String getId() {
        return this.id;
    }



}
