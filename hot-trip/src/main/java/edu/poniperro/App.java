package edu.poniperro;

import edu.poniperro.interfaces.Pedido;
import edu.poniperro.interfaces.PedidoPeligroso;
import edu.poniperro.interfaces.TratamientoPedido;
import edu.poniperro.pedidos.PedidoInternacional;
import edu.poniperro.pedidos.PedidoPeligrosoOrden;
import edu.poniperro.procesadores.Oficina;
import edu.poniperro.tratamientos.TratamientoPedidoInternacional;
import edu.poniperro.tratamientos.TratamientoPedidoPeligroso;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {

        Oficina oficina = new Oficina();

        Pedido pedido = new PedidoInternacional("Comarca", 10);
        TratamientoPedido tratamientoInt = new TratamientoPedidoInternacional(
                                                    (PedidoInternacional) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoInternacional("Mordor", 10);
        tratamientoInt = new TratamientoPedidoInternacional((PedidoInternacional) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoPeligrosoOrden("Cima de los vientos",
                                          "No urgarse en las uñas con este puñal");
        TratamientoPedido peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        pedido = new PedidoPeligrosoOrden("Monte del destino",
                                          "No ponerselo en el dedo");
        peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);

        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        /**
         * Los pedidos multiples se completan en el ultimo de los casos test
         */
    }
}
