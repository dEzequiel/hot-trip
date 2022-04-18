package edu.poniperro.tratamientos;

import java.util.HashSet;
import java.util.Set;

import edu.poniperro.interfaces.Pedido;
import edu.poniperro.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido{

    private Integer pesoTotal;
    private Long numBultos;

    private Set<Pedido> pedidos;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void calcularPesoTotal() {
        this.pesoTotal = pedidos.stream().map(Pedido::peso).reduce(0, Integer::sum);
    }

    public Integer getPesoTotal() {
        return this.pesoTotal;
    }

    public void calcularTotalBultos() {
        this.numBultos = this.pedidos.stream().count();
    }

    public Long getNumBultos() {
        return this.numBultos;
    }

    @Override
    public boolean tratar() {
        if (getPesoTotal() > 0 && getNumBultos() == pedidos.size()) {
            return true;
        } else {
            return false;
        }
    }
}
