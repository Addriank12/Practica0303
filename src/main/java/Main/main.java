/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import vista.VentanaEquipo;
import vista.VentanaJugador;
import vista.VentanaPartido;

/**
 *
 * @author Adrian
 */
public class main {
    
    public static void main(String[] args) {
        VentanaEquipo ventana = new VentanaEquipo();
        ventana.show();
        VentanaJugador ventana2 = new VentanaJugador();        
        ventana2.show();
        VentanaPartido ventana3 = new VentanaPartido();
        ventana3.show();
    }
    
}
