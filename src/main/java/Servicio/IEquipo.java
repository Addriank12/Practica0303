/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modelo.Equipo;

/**
 *
 * @author Adrian
 */
public interface IEquipo {
    public Equipo crear(Equipo equipo);
    public List<Equipo> listar();
    
}
