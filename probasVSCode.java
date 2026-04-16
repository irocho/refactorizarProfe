import java.util.Arrays;
import java.util.List;

public class probasVSCode {

    private static final double PI = 3.14;
    private int area;

    public static void main(String[] args) {
        System.out.println("Casos de uso");

        // Caso 1: Poñer nome ás variables
        // ======================================================
        List<String> colorins = Arrays.asList("vermello", "laranxa", "verde");
        System.err.println(colorins.get(2));

        // Caso 2: Mellora de lazos ou bucles
        // ======================================================
        String[] libros = { "Don Quijote", "Crimen e castigo" };
        for (String libro : libros) {
            System.out.println(libro);
        }
    }

    // //Caso 3: Crear constantes
    // ======================================================
    public double getArea(double r) {
        return PI * r * r;
    }

    // // Caso 4: Extraer a método
    // ======================================================
    public void extraerMetodo() {
        int altura = 1;
        int base = 2;
        calculoArea(altura, base);
    }

    private int calculoArea(int altura, int base) {
        return area = base * altura;
    }

    // //Caso 5: Extraer variable
    // ======================================================
    String ordenador = "MAC";

    public void extraerVar() {
        boolean seraMAC = ordenador.equalsIgnoreCase("MAC");
        if (seraMAC) {
            System.out.println("é un Mac");
        }
    }
}