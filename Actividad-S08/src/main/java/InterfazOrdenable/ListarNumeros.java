/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazOrdenable;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author ENVY
 */
public class ListarNumeros implements Ordenable{
    
    private List<Integer> numeros;
    
    public ListarNumeros(List<Integer> numero){
        this.numeros=numero;
    }

    @Override
    public String Ordenable() {
       Collections.sort(numeros);
        return ("Lista ordenada de numeros: "+numeros); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
