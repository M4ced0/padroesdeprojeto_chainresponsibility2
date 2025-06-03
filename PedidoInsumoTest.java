package agronegocio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoInsumoTest {

    DiretorCooperativa diretor;
    GerenteFazenda gerente;
    TecnicoAgricola tecnico;
    AuxiliarAgricola auxiliar;

    @BeforeEach
    void setUp() {
        diretor = new DiretorCooperativa(null);
        gerente = new GerenteFazenda(diretor);
        tecnico = new TecnicoAgricola(gerente);
        auxiliar = new AuxiliarAgricola(tecnico);
    }

    @Test
    void deveRetornarAuxiliarParaSemente() {
        assertEquals("AuxiliarAgricola", auxiliar.responderPedido(new PedidoInsumo(TipoInsumoSemente.getTipoInsumo())));
    }

    @Test
    void deveRetornarTecnicoParaFertilizante() {
        assertEquals("TecnicoAgricola", auxiliar.responderPedido(new PedidoInsumo(TipoInsumoFertilizante.getTipoInsumo())));
    }

    @Test
    void deveRetornarGerenteParaMaquina() {
        assertEquals("GerenteFazenda", auxiliar.responderPedido(new PedidoInsumo(TipoInsumoMaquina.getTipoInsumo())));
    }

    @Test
    void deveRetornarDiretorParaTrator() {
        assertEquals("DiretorCooperativa", auxiliar.responderPedido(new PedidoInsumo(TipoInsumoTrator.getTipoInsumo())));
    }

    @Test
    void deveRetornarSemAprovacaoParaTipoDesconhecido() {
        assertEquals("Sem aprovação", auxiliar.responderPedido(new PedidoInsumo(TipoInsumoDesconhecido.getTipoInsumo())));
    }
}
