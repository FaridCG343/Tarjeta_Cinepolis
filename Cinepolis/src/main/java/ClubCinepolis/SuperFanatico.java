/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubCinepolis;

/**
 *
 * @author farid
 */
public class SuperFanatico extends Fanatico implements BeneficiosSuperfanatico{

    public SuperFanatico(String numTarjeta, String nombre) {
        super(numTarjeta, nombre);
    }

    @Override
    public void cupones() {
        System.out.println("Obtuviste un cupon =D");
    }

    @Override
    public void usarPuntos() {
        System.out.println("Todos los puntos que has acumulado los puedes usar para obtener descuentos!!!");
    }
    
}
