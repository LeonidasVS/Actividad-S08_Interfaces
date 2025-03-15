/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad.s08;

import IntefazNotificacion.CorreoElectronico;
import IntefazNotificacion.SMS;
import InterfazAlimentacion.Animal;
import InterfazAlimentacion.Persona;
import InterfazAnimales.InterfaceGatuna;
import InterfazAnimales.InterfacePerruna;
import InterfazCalculadoraDescuento.DescuentoFijo;
import InterfazCalculadoraDescuento.DescuentoPorcentaje;
import InterfazComparacionObjetos.Producto;
import InterfazDePagos.PagoConTarjeta;
import InterfazDePagos.PagoEfectivo;
import InterfazFiguraGeometrica.Circulo;
import InterfazVehiculo.InterfaceBicicleta;
import InterfazVehiculo.InterfaceCoche;
import InterfazFiguraGeometrica.Rectangulo;
import InterfazOrdenable.ListarNumeros;
import InterfazTrabajador.Desarrollador;
import InterfazTrabajador.Diseñador;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ENVY
 */
public class ActividadS08 {

    public static void main(String[] args) {
        
        //Intefaz Animales
        InterfaceGatuna gato= new InterfaceGatuna();
        InterfacePerruna perro=new InterfacePerruna();
        
        //Interfaz Vehiculo
        InterfaceBicicleta b= new InterfaceBicicleta();
        InterfaceCoche c=new InterfaceCoche();
        
        //Interfaz de pago
        PagoConTarjeta pct=new PagoConTarjeta();
        PagoEfectivo pe=new PagoEfectivo();
        
        //Interfaz de FiguraGeometrica
        Circulo circulo=new Circulo(3);
        Rectangulo rec=new Rectangulo(2,2);
        
        //Interfaz de trabajador
        Desarrollador desa=new Desarrollador();
        Diseñador diseño=new Diseñador();
        
        //Interfaz de ordenable
        List<Integer> numeros=new ArrayList();
        numeros.add(100);
        numeros.add(50);
        numeros.add(70);
        numeros.add(12);
        numeros.add(11);
        ListarNumeros lista= new ListarNumeros(numeros);
        
        //Interfaz Alimentacion
        Animal ani=new Animal();
        Persona persona=new Persona();
        
        //Interfaz Notidicacion
        SMS sms =new SMS();
        CorreoElectronico correo=new CorreoElectronico();
        
        //Interfaz Comparacion de objetos
        Producto pro1=new Producto(19);
        Producto pro2=new Producto(19);
        
        //Interfaz de Calcular Descuento
        DescuentoFijo desf=new DescuentoFijo(5);
        DescuentoPorcentaje desp=new DescuentoPorcentaje(12);
        
        
        
        
        //Imprimir Interfaz Animales
        System.out.println(perro.hacerSonido(12));
        System.out.println(gato.mover(10));
        
        //Imprimir Interfaz Vehiculo
        System.out.println(b.detener("el parque"));
        System.out.println(c.arrancar(50));
        
        //Imprimit Interfaz Pago
        System.out.println(pct.procesarPago(5.78));
        System.out.println(pe.procesarPago(1.25));
        
        //Imprimir Interfaz de FiguraGeometrica
        System.out.println(circulo.perimetro());
        System.out.println(rec.area());
        
        //Imprimir Interfaz de trabajador
        System.out.println(desa.trabajar("Leonidas"));
        System.out.println(diseño.trabajar("Juvini"));
        
        //Imprimir Interfaz de ordenable
        System.out.println(lista.Ordenable());
        
        //Imprimir Interfaz Alimentacion
        System.out.println(ani.comer(2));
        System.out.println(persona.comer(6));
        
        //Imprimir Interfaz Notidicacion
        System.out.println(sms.enviarNotificacion());
        System.out.println(correo.enviarNotificacion());
        
        //Imprimir Interfaz Comparacion de objetos
        int resultado=pro1.comparacion(pro2);
        if (resultado < 0) {
            System.out.println("Producto1 es más barato que Producto2");
        } else if (resultado > 0) {
            System.out.println("Producto1 es más caro que Producto2");
        } else {
            System.out.println("Ambos productos tienen el mismo precio");
        }
        
        //Imprimir Interfaz de Calcular Descuento
        double precionormal=69;
        
        System.out.println("Precio original: "+precionormal);
        System.out.println("Precio con descuento con precio fijo: $"+desf.calcularDescuento(precionormal));
        System.out.println("Precio con descuento en porcentaje: $"+desp.calcularDescuento(precionormal));
    }
}
