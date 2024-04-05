/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

/**
 *
 * @author Lenovo
 */
public class Circulo {
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double CalcularArea(){
        double area = (3.1416)*Math.pow(radio, 2);
        return area;
    }
    public double CalcularPerimetro(){
        double perimetro = 2*(3.1416)*radio;
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String toString(){
        return "el area del circulo es: "+this.CalcularArea()+" cm2"+
                "\nel perimetro del circulo es: "+this.CalcularPerimetro()+" cm";
    }
    
}
