/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubCinepolis;

/**
 *
 * @author farid
 */
public class Fan extends Tarjeta implements BeneficiosFan{

    public Fan(String numTarjeta, String nombre) {
        super(numTarjeta, nombre);
    }

    @Override
    public void martes2x1() {
        System.out.println("Obtuviste un descuento del 2x1");
    }

    @Override
    public void combolunes() {
        System.out.println("Obtuviste 2 entradas, unas palomitas y 2 refrescos por solo $169!!!");
    }

    @Override
    public void cumpleaños() {
        System.out.println("Por ser el mes de tu cumpleaños obtuviste 2x1 en entradas, palomitas y refrescos, Happy Birthday =D");
    }

    @Override
    public void palomitasGourmet() {
        System.out.println("Obtuviste unas alomitas Gourmet por solo $79");
    }
    
    @Override
    public void puntos() {
        System.out.println("Cada compra que haces te da puntos");
    }
}
