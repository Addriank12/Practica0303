/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Partido;

/**
 *
 * @author Adrian
 */
public class PartidoServicio implements IPartido
{
    private List<Partido> listPartido;
    public PartidoServicio()
    {
        listPartido =new ArrayList<>();
    }

    @Override
    public Partido crear(Partido partido) {
        this.listPartido.add(partido);
        return partido;
    }

    @Override
    public List<Partido> listar() {
        return this.listPartido;
    }
}
