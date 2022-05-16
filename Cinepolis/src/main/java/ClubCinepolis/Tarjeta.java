/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubCinepolis;

/**
 *
 * @author farid
 */
public class Tarjeta {
    private String numTarjeta,nombre;

    public Tarjeta(String numTarjeta, String nombre) {
        this.numTarjeta = numTarjeta;
        this.nombre = nombre;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tarjeta: \nnumTarjeta: " + numTarjeta + "\nNombre:" + nombre;
    }
    
}
