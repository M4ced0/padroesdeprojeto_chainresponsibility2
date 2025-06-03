package agronegocio;

public class TecnicoAgricola extends Funcionario {
    public TecnicoAgricola(Funcionario proximo) {
        super(proximo);
    }

    @Override
    protected boolean podeAprovar(String tipo) {
        return tipo.equals("Fertilizante");
    }
}
