package edu.poniperro.procesadores;

import edu.poniperro.interfaces.Procesador;
import edu.poniperro.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public Oficina(){};

    public boolean procesa(TratamientoPedido tratamiento) {

        if (!tratamiento.tratar()) {
            return false;
        }

        return true;

    }

}
