
package app.fichas;

/**
 * Ficha vacia. Esta clase vacia es importante cuando no existe un objeto Ficha 
 * en la matriz del tablero
 */
public class Vacia extends Fichas {
    public Vacia(int posicionX, int posicionY, int lugar) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.lugar = lugar;
    }
}