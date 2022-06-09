/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Adrian
 */
public class Equipo
{
    private String nombre;
    private int nJugadores;
    private String confederacion;
    private String propietario;
    private int gastos;

    public Equipo(String nombre, int nJugadores, String confederacion, String propietario, int gastos) {
        this.nombre = nombre;
        this.nJugadores = nJugadores;
        this.confederacion = confederacion;
        this.propietario = propietario;
        this.gastos = gastos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnJugadores() {
        return nJugadores;
    }

    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", nJugadores=" + nJugadores + ", confederacion=" + confederacion + ", propietario=" + propietario + ", gastos=" + gastos + '}';
    }
    
    
    
}
