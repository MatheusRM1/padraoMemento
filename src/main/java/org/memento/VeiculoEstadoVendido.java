package org.memento;

public class VeiculoEstadoVendido implements VeiculoEstado {

    private VeiculoEstadoVendido() {};
    private static VeiculoEstadoVendido instance = new VeiculoEstadoVendido();

    public static VeiculoEstadoVendido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vendido";
    }
}