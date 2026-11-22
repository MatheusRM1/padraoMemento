import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.memento.*;

class VeiculoTest {

    @Test
    void deveArmazenarEstados() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoEstadoDisponivel.getInstance());
        veiculo.setEstado(VeiculoEstadoAlugado.getInstance());

        assertEquals(2, veiculo.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoEstadoDisponivel.getInstance());
        veiculo.setEstado(VeiculoEstadoAlugado.getInstance());

        veiculo.restauraEstado(0);

        assertEquals(VeiculoEstadoDisponivel.getInstance(), veiculo.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoEstadoDisponivel.getInstance());
        veiculo.setEstado(VeiculoEstadoAlugado.getInstance());
        veiculo.setEstado(VeiculoEstadoManutencao.getInstance());
        veiculo.setEstado(VeiculoEstadoVendido.getInstance());

        veiculo.restauraEstado(2);

        assertEquals(VeiculoEstadoManutencao.getInstance(), veiculo.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}