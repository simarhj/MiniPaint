/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.grafico;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author sehjud
 */
public class Ventana extends JFrame{

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setBounds(0, 0, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        minipaint.MiniPaint.dibujarC((Graphics2D) g);
    }
    
    
    
}
