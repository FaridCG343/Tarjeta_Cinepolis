/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubCinepolis;

/**
 *
 * @author farid
 */
public class Fanatico extends Fan implements BeneficiosFanatico{

    public Fanatico(String numTarjeta, String nombre) {
        super(numTarjeta, nombre);
    }

    @Override
    public void entradasPrecioEspecial() {
        System.out.println("Obtuviste entradas por un precio especial");
    }

    @Override
    public void RefilFanatico() {
        System.out.println("Puedes usar un refill por dia en palomitas y refrescos por $20");
    }
    
}
