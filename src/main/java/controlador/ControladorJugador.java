/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Servicio.EquipoServicio;
import Servicio.JugadorServicio;
import java.util.List;
import modelo.Equipo;
import modelo.Jugador;

/**
 *
 * @author Adrian
 */
public class ControladorJugador {
    private final JugadorServicio jugadorServicio = new JugadorServicio();
    
    public Jugador crear(String[] params, Equipo equipo){
        Jugador jugador = new Jugador(params[0], params[1], Integer.valueOf(params[2]), params[3], Integer.valueOf(params[4]),params[5],equipo);
        this.jugadorServicio.crear(jugador);
        return jugador;
    }
    
    
    public List<Jugador> listar()
    {
        return this.jugadorServicio.listar();
    }
}
