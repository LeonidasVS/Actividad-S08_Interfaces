/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazAlimentacion;

/**
 *
 * @author ENVY
 */
public class Persona implements Alimentacion{

    @Override
    public String comer(int comida) {
        if(comida>=1 && comida<=10){
            return "La persona se comio muchas pupusas en total fueron: "+comida;
        }else{ 
           return ("La persona comio o se llevo demasiadas pupusas");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
 
}
