package Empregado;

public class cargoEmpregado {
    private String cargo;
    private double horabase;

    public cargoEmpregado(String t, double h) {
        this.cargo = t;
        this.horabase = h;
    }

    public String getCargo() {
        return cargo;
    }

    public double getHorabase() {
        return horabase;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHorabase(double horabase) {
        this.horabase = horabase;
    }
}
