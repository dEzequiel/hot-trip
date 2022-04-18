package edu.poniperro.procesadores;

import edu.poniperro.interfaces.Pedido;
import edu.poniperro.interfaces.Procesador;
import edu.poniperro.interfaces.Status;
import edu.poniperro.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public Oficina(){};

    public boolean procesa(TratamientoPedido tratamiento) {

        if (!tratamiento.tratar()) {
            return false;
        }
        return true;

    };

    public String printarStatus(boolean estado, Pedido pedido) {
        if (estado) {
            return pedido.destino() + " " + Status.ACEPTADO.name();
        } else {
            return pedido.destino() + " " +Status.RECHAZADO.name();
        }
    };
}
