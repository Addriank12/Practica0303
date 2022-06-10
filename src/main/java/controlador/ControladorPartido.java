/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Servicio.PartidoServicio;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import modelo.Equipo;
import modelo.Partido;

/**
 *
 * @author Adrian
 */
public class ControladorPartido {
    private final PartidoServicio partidoServicio = new PartidoServicio();
    
    public Partido crear(String[] params, Equipo local, Equipo visitante, Date fecha){
        Partido partido = new Partido(fecha, Integer.valueOf(params[1]), params[2], params[3], local, visitante);
        this.partidoServicio.crear(partido);
        return partido;
    }
    
    
    public List<Partido> listar()
    {
        return this.partidoServicio.listar();
    }
}
