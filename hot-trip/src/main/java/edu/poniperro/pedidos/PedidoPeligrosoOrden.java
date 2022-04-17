package edu.poniperro.pedidos;

import java.util.UUID;

import edu.poniperro.interfaces.Pedido;
import edu.poniperro.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {
    private final String id = UUID.randomUUID().toString();
    private String destino;
    private int peso;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.destino = destino;
        this.instrucciones = instrucciones;
    }

    /**
     * La interfaz PedidoPeligro hereda de la interfaz Pedido, por eso
     * aunque no esten declarados dentro de PedidoPeligroso se deben de
     * implementar dentro de este esta clase.
     */

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    public String getId() {
        return this.id;
    }
}
