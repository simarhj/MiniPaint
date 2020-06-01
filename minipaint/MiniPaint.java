/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint;

import java.awt.Graphics2D;
import minipaint.grafico.Ventana;
import minipaint.modelo.figuras.*;
import minipaint.modelo.herramientas.PortaPapeles;

/**
 *
 * @author sehjud
 */
public class MiniPaint {

    
    static Figura c = new Circulo(100, 130, 1, "rojo", 100);
    static PortaPapeles p = new PortaPapeles();
    
    static Ventana v;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        p.getLista().add(c);
        p.getLista().add(new Cuadrilatero(20, 25, 1, "rojo", 150, 30));
        p.getLista().add(new Cuadrilatero(20, 55, 1, "rojo", 30, 30));
        p.borrarFigura(c);
        System.out.println(c.calcularArea());
        v = new Ventana("Prueba Dibujo");
        
    }
    
    public static void dibujarC(Graphics2D g){
        p.dibujarFiguras(g);
    }
    
}
