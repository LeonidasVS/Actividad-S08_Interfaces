/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazFiguraGeometrica;

/**
 *
 * @author ENVY
 */
public class Rectangulo implements FiguraGeometrica {
    private double ancho, alto;
    
    public Rectangulo(double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
    }
    @Override
    public double area() {
        return ancho*alto; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro() {
       return 2*(ancho+alto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
