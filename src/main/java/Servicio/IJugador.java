/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modelo.Jugador;

/**
 *
 * @author Adrian
 */
public interface IJugador {
      public Jugador crear(Jugador jugador);
    public List<Jugador> listar();
}
