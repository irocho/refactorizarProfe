package Empregado;

public class CargoEmpregado {
    private String cargo;
    private double eurosPorHora;

    public CargoEmpregado(String t, double eurosPorHora) {
        this.cargo = t;
        this.eurosPorHora = eurosPorHora;
    }

    public String getCargo() {
        return cargo;
    }

    public double geteurosPorHora() {
        return eurosPorHora;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void seteurosPorHora(double eurosPorHora) {
        this.eurosPorHora = eurosPorHora;
    }
}
