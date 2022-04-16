package edu.poniperro.tratamientos;

import edu.poniperro.interfaces.PedidoPeligroso;
import edu.poniperro.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    private final PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        return pedido.instrucciones() != "No ponerselo en el dedo";
    }

    public PedidoPeligroso getPedido() {
        return this.pedido;
    }



}
