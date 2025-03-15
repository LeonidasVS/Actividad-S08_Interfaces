/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazVehiculo;

/**
 *
 * @author ENVY
 */
public class InterfaceBicicleta implements Vehiculo{

    @Override
    public String arrancar(int velocidad) {
        return "La bicicleta va a una velocidad de "+velocidad+ " km/h"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String detener(String seDetuvo) {
        return "La bicicleta se detuvo en "+seDetuvo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
