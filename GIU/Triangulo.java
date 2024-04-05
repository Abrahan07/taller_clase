/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

/**
 *
 * @author Lenovo
 */
public class Triangulo {
    private double base;
    private double altura;

    
    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    public double CalcularArea(){
        double area = (base*altura)/2;
        return area;
    }
    public double CalcularHipotenusa(){
        double hipo=Math.sqrt((base*base)+(altura*altura));
        return hipo;
    }
    
    public double CalcularPerimetro(){
        double perimetro = base+altura+this.CalcularHipotenusa();
        return perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "el area del triangulo es: "+this.CalcularArea()+" cm2"+
                "\nel perimetro del triangulo es: "+this.CalcularPerimetro()+" cm"+
                "\nla hipotenusa del triangulo es: "+this.CalcularHipotenusa();
    }
    
    
}
