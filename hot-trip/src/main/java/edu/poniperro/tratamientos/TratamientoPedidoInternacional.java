package edu.poniperro.tratamientos;

import edu.poniperro.interfaces.Pedido;
import edu.poniperro.interfaces.TratamientoPedido;
import edu.poniperro.pedidos.PedidoInternacional;


public class TratamientoPedidoInternacional implements TratamientoPedido{

    private final PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    public PedidoInternacional getPedido() {
        return this.pedido;
    }

    @Override
    public boolean tratar() {
        // return pedido.destino().equals("Mordor");
        return pedido.destino() != "Mordor";
    }
}
