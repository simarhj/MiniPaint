/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.modelo.figuras;

import java.awt.Graphics2D;

/**
 *
 * @author sehjud
 */
public class Cuadrilatero extends Figura {
    
    private int ancho, alto;

    public Cuadrilatero(int posx, int posy, int grosor, String color, int ancho, int alto) {
        super(posx, posy, grosor, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho*alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2*ancho+2*alto;
    }

    @Override
    public void dibujarFigura(Graphics2D g) {
        g.drawRect(posx, posy, ancho, alto);
    }
    
}
