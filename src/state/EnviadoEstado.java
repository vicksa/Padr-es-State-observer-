package state;

public class EnviadoEstado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Operacao pagar bloqueada: pedido no estado Enviado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Operacao enviar bloqueada: pedido no estado Enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        pedido.alterarEstado(new EntregueEstado());
        System.out.println("Pedido entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Operacao cancelar bloqueada: pedido no estado Enviado.");
    }

    @Override
    public void solicitarDevolucao(Pedido pedido) {
        System.out.println("Operacao solicitarDevolucao bloqueada: pedido no estado Enviado.");
    }
}
