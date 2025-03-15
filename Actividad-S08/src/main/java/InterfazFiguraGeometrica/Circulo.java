/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazFiguraGeometrica;

/**
 *
 * @author ENVY
 */
public class Circulo implements FiguraGeometrica{

    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    @Override
    public double area() {
        return Math.PI * radio * radio; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
