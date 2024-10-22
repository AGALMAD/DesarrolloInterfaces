/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author agalmad
 */
public class JPanelImagen extends JPanel implements Serializable{
    
    private ImagenFondo imagenFondo;
    
    public JPanelImagen(){
        
    }

    
    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    
    
    
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
       if(imagenFondo.getRutaImagen() != null && imagenFondo.getRutaImagen().exists()){
            ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen());
            g.drawImage( imageIcon.getImage(), 0, 0, null);
       }
    }
   
}
