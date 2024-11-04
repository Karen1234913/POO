/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raices;
/**
 *
 * @author Karen
 */
public class Raices {
    
private double a;
private double b;
private double c;


public Raices(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
}

private void obtenerRices(){

    double x1=(-b+Math.sqrt(getDiscremente()))/(2*a);
    double x2=(-b+Math.sqrt(getDiscremente()))/(2*a);

    System.out.println("Solucion x1");
    System.out.println(x1);
    System.out.println("Solucion x2");
    System.out.println(x2);
}

private void obtenerRaiz(){

    double x=(-b)/(2*a);

    System.out.println("Unica solucion");
    System.out.println(x);
}

private double getDiscremente(){
    return Math.pow(b, 2)-(4*a*c);
}

private boolean tieneRaices(){
     return getDiscremente()>0;
}
private boolean tieneRaiz(){
   return getDiscremente()==0;
}

public void calcular(){

    if (tieneRaices()) {
        obtenerRaiz();
    }else if (tieneRaiz()) {
        obtenerRaiz();
    }else{
        System.out.println("No tiene solucion");
    }
}
}
