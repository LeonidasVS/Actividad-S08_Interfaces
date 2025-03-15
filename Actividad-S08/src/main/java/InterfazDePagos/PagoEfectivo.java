/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazDePagos;

/**
 *
 * @author ENVY
 */
public class PagoEfectivo implements Pago{

    @Override
    public String procesarPago(double cantidad) {
        return "El pago en efectivo fue de: $"+cantidad; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
