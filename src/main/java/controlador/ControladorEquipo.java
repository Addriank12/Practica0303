/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Servicio.EquipoServicio;
import java.util.List;
import modelo.Equipo;
import modelo.Jugador;

/**
 *
 * @author Adrian
 */
public class ControladorEquipo
{
    private static EquipoServicio equipoServicio = new EquipoServicio();
    
    public Equipo crear(String[] params){
        Equipo equipo = new Equipo(params[0], Integer.valueOf(params[1]), params[2], params[3], Integer.valueOf(params[4]));
        this.equipoServicio.crear(equipo);
        return equipo;
    }
    
    
    public List<Equipo> listar()
    {
        return this.equipoServicio.listar();
    }
}
