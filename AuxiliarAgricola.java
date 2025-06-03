package agronegocio;

public class AuxiliarAgricola extends Funcionario {
    public AuxiliarAgricola(Funcionario proximo) {
        super(proximo);
    }

    @Override
    protected boolean podeAprovar(String tipo) {
        return tipo.equals("Semente");
    }
}
