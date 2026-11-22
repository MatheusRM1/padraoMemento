package org.memento;

public class VeiculoEstadoManutencao implements VeiculoEstado {

    private VeiculoEstadoManutencao() {};
    private static VeiculoEstadoManutencao instance = new VeiculoEstadoManutencao();

    public static VeiculoEstadoManutencao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em manutenção";
    }
}