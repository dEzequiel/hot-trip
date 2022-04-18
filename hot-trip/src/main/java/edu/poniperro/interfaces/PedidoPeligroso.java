package edu.poniperro.interfaces;

/**
 * La interfaz PedidoPeligroso hereda los metodos de la
 * interfaz Pedido y unicamente implementa un metodo.
 */

public interface PedidoPeligroso extends Pedido{
    String instrucciones();
}
