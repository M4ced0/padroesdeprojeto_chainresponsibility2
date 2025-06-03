package agronegocio;

public abstract class Funcionario {
    private Funcionario proximo;

    public Funcionario(Funcionario proximo) {
        this.proximo = proximo;
    }

    public String responderPedido(PedidoInsumo pedido) {
        if (podeAprovar(pedido.getTipo())) {
            return this.getClass().getSimpleName();
        }
        if (proximo != null) {
            return proximo.responderPedido(pedido);
        }
        return "Sem aprovação";
    }

    protected abstract boolean podeAprovar(String tipo);
}
