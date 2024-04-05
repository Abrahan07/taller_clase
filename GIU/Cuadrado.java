/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

/**
 *
 * @author Lenovo
 */
public class Cuadrado {
    private double lado ;
    
    
    public Cuadrado (double lado){
        this.lado=lado;
    }
    
    
    public double CalcularArea (){
        double area = lado * lado;
        return area;
    }
    public double CalcularPerimetro(){
        double perimetro = lado*4;
        return perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "el area del cuadrado es: "+this.CalcularArea()+" cm2"+
                "\nel perimetro del cuadrado es: "+this.CalcularPerimetro()+" cm";
    }
    
    
    
}
