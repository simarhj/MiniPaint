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
public abstract class Figura {
    
    protected int posx,posy,grosor;
    protected String color;

    public Figura(int posx, int posy, int grosor, String color) {
        this.posx = posx;
        this.posy = posy;
        this.grosor = grosor;
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
    public abstract void dibujarFigura(Graphics2D g);
}
