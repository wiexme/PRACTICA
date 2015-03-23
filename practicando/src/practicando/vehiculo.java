/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicando;

/**
 *
 * @author GESSEÑY
 */
//moto, avion
public class vehiculo {
    String modelo;
    String marca;
    String color;
    int NumeroRuedas;
    
    public vehiculo(){
    }
    
    public void encender(){
        System.out.println("El vehiculo se encendio!!");
        
    }
    
    public void apagar(){
        System.out.println("El vehiculo se apago!!");
    }    
     public void Encender(String Marca){
       System.out.println("El vehiculo"+Marca+" se encendio!!");
    
    }
    public void Encender(String Marca, int NumeroPuertas){
       System.out.println("El vehiculo"+Marca+" con "+NumeroPuertas+" se encendio!!");
    
    }
}
