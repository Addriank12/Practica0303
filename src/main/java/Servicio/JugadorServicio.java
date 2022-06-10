/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;

/**
 *
 * @author Adrian
 */
public class JugadorServicio implements IJugador {
    private List<Jugador> listJugador;
    
    public JugadorServicio()
    {
        listJugador= new ArrayList<>();
    }

    @Override
    public Jugador crear(Jugador jugador) {
        this.listJugador.add(jugador);
        return jugador;
    }

    @Override
    public List<Jugador> listar() {
        return this.listJugador;
    }
}
