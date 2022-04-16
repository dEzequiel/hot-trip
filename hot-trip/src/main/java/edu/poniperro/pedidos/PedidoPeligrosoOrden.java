package edu.poniperro.pedidos;

import edu.poniperro.interfaces.Pedido;
import edu.poniperro.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements Pedido {
    // private final String id;
    private String destino;
    private int peso;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.destino = destino;
        this.instrucciones = instrucciones;
    }

    public int peso() {
        return this.peso;
    }

    public String instrucciones() {
        return this.instrucciones;
    }

    public String destino() {
        return this.destino;
    }

    // public String getId() {
    //     return this.id;
    // }
}
