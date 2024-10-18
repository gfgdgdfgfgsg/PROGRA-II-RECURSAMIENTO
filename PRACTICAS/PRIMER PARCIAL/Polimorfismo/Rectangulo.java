package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase necesita de tu ayuda!
 */
public class Rectangulo extends FiguraGrafica {

    // Coordenadas del rectángulo
    private int[] x = {50, 100, 100, 50}; // Cuatro puntos para un rectángulo
    private int[] y = {50, 50, 80, 80};   // Altura modificada

    @Override
    public void dibujar(Graphics g) {
        g.drawPolygon(x, y, 4);  // Se dibuja un rectángulo con 4 puntos
    }

    @Override
    public void encojer(Graphics g) {
        x[1] -= 5; x[2] -= 5;  // Reduce el ancho
        y[2] -= 5; y[3] -= 5;  // Reduce la altura
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        x[1] += 5; x[2] += 5;  // Aumenta el ancho
        y[2] += 5; y[3] += 5;  // Aumenta la altura
        this.dibujar(g);    
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
        switch (direccion) {
            case "arriba" :
                for (int i = 0; i < y.length; i++) y[i] -= 5; 
                break;
            case "abajo" :
                for (int i = 0; i < y.length; i++) y[i] += 5; 
                break;
            case "izquierda" :
                for (int i = 0; i < x.length; i++) x[i] -= 5; 
                break;
            case "derecha" :
                for (int i = 0; i < x.length; i++) x[i] += 5; 
                break;
        }
        this.dibujar(g);
    }
}
