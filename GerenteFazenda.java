package agronegocio;

public class GerenteFazenda extends Funcionario {
    public GerenteFazenda(Funcionario proximo) {
        super(proximo);
    }

    @Override
    protected boolean podeAprovar(String tipo) {
        return tipo.equals("Maquina");
    }
}
