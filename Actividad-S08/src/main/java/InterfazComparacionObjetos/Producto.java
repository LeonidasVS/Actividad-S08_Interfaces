/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazComparacionObjetos;

/**
 *
 * @author ENVY
 */
public class Producto implements ComparableObjetos{
    private double precio;
    
    public Producto(double precios){
        this.precio=precios;
    }
    @Override
    public int comparacion(Object o) {
        if(o instanceof Producto){
            Producto otro= (Producto) o;
            return Double.compare(this.precio, otro.precio);
        }
        return 0;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
