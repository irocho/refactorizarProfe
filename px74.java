// /**
//  * Mostra a foto e logo imprime a identidade e idade.
//  * @param identidade
//  * @param idade
//  * @see  SEN REFACTORIZAR
//  */
// void visualizarDatos(String identidade, int idade) {
//     mostrarFoto();
//     System.out.println("Identidade: " + identidade);
//     System.out.println("Idade: " + idade);
// }

// Redución lóxica

/**
 * Mostrar a foto e logo imprime a identidade e idade.
 * 
 * @param ident
 * @param idade
 * @see REFACTORIZADO
 */
void visualizarDatosRef(String ident, int idade) {
    mostrarFoto();
    mostrarDatos(ident, idade);
}

/**
 * Imprime a identidade e idade.
 * 
 * @param ident
 * @param anos
 * @see REFACTORIZADO
 */
void mostrarDatos(String ident, int anos) {
    System.out.println("Identidade: " + ident);
    System.out.println("Idade: " + anos);
}
