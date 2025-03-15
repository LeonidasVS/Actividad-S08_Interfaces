/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazVehiculo;

/**
 *
 * @author ENVY
 */
public class InterfaceCoche implements Vehiculo{

    @Override
    public String arrancar(int velocidad) {
       return "El carro acelera a una velocidad de "+velocidad+" km/h"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String detener(String seDetuvo) {
        return "El carro se detuvo en "+seDetuvo+" debido a una necesidad"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
