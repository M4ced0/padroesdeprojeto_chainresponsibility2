package agronegocio;

public class DiretorCooperativa extends Funcionario {
    public DiretorCooperativa(Funcionario proximo) {
        super(proximo);
    }

    @Override
    protected boolean podeAprovar(String tipo) {
        return tipo.equals("Trator");
    }
}
