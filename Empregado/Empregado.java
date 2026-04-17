package Empregado;

public class Empregado {

    private int horas;
    private int horasextra;
    private cargoEmpregado cargo;

    public double calculoHoras() {
        if (cargo.getCargo().equals("Supervisor")) {
            return horas + horasextra * 1.40;
        }
        if (cargo.getCargo().equals("Dependente")) {
            return horas + horasextra * 1.75;
        }
        return horas + horasextra*1.5;
    }

    public double getSoldo() {
        return cargo.getHorabase() * calculoHoras();
    };
}
