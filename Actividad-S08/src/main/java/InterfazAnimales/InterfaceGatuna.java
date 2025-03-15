/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazAnimales;

/**
 *
 * @author ENVY
 */
public class InterfaceGatuna implements Animales{

    @Override
    public String hacerSonido(int hacesonido) {
        return("El gato maulla "+hacesonido+" veces al dia") ;//rom nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String mover(int camina) {
        return("El gato camino "+camina+" veces al dia"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
