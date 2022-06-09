/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;

/**
 *
 * @author Adrian
 */
public class EquipoServicio implements IEquipo {
    private List<Equipo> listEquipo;
    
    public EquipoServicio()
    {
        listEquipo= new ArrayList<>();
    }
    @Override
    public Equipo crear(Equipo equipo) {
        this.listEquipo.add(equipo);
        return equipo;
    }

    @Override
    public List<Equipo> listar() {
        return this.listEquipo;
    }
    
}
