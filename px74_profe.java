public class px74_profe {

    public static void main(String[] args) {
        System.out.println("Redución lóxica");
        visualizarDatosRef("Profe", 22);
    }

    public static void mostrarFoto() {
        System.out.println("Aquí foto");
    }

    public static void visualizarDatosRef(String ident, int idade) {
        mostrarFoto();
        mostrarDatos(ident, idade);

    }

    public static void mostrarDatos(String eu, int anos) {
        System.out.println("Eu son: " + eu);
        System.out.println("a miña idade é : " + anos);
    }

}
// Redución lóxica executable
