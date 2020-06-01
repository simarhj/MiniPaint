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
public class Circulo extends Figura{
    
    private int radio;

    public Circulo(int posx, int posy, int grosor, String color, int radio) {
        super(posx, posy, grosor, color);
        this.radio = radio;
    }   
    
    

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio+0.0, 2.0);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void dibujarFigura(Graphics2D g) {
        
        g.drawOval(posx-radio, posy-radio, 2*radio, 2*radio);
    }
    
}
