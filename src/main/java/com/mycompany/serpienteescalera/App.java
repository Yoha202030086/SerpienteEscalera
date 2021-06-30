
package app;

import app.consola.Consola;

public class App {

    /**
     * Metodo main de la aplicacion. Se inicia el juego por consola
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consola consola = new Consola();
        consola.iniciarJuego();
    }
}
