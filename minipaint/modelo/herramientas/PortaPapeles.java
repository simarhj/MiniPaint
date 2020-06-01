/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.modelo.herramientas;

import java.awt.Graphics2D;
import java.util.ArrayList;
import minipaint.modelo.figuras.Figura;

/**
 *
 * @author sehjud
 */
public class PortaPapeles {
    
    private ArrayList<Figura> lista = new ArrayList<Figura>();

    /**
     * @return the lista
     */
    public ArrayList<Figura> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Figura> lista) {
        this.lista = lista;
    }
    
    public void borrarFigura(Figura f){
        this.lista.remove(f);
    }
    
    public void dibujarFiguras(Graphics2D g){
        for (Figura figura : lista) {
            figura.dibujarFigura(g);
        }
    }
    
    
    
}
