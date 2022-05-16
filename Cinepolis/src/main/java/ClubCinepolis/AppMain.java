/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClubCinepolis;

/**
 *
 * @author farid
 */
public class AppMain {
    public static void main(String[] args) {
        Fan T0001=new Fan("2958276819375829","Farid Castillo");
        Fanatico T0002=new Fanatico("6819572859385728","Jaime Salas");
        SuperFanatico T0003=new SuperFanatico("6729671948205739", "Diego Baylon");
        System.out.println(T0001);
        T0001.combolunes();
        T0001.cumpleaños();
        T0001.martes2x1();
        T0001.palomitasGourmet();
        T0001.puntos();
        System.out.println(T0002);
        T0002.RefilFanatico();
        T0002.entradasPrecioEspecial();
        System.out.println(T0003);
        T0003.cupones();
        T0003.usarPuntos();
    }
}
