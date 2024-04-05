/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Lenovo
 */
public class Persona {
    private LocalDate fecha;
    
    public Persona (){
    }
    public Persona (LocalDate fecha){
        this.fecha=fecha;
    }
    
    public Period Tiempo (){
        LocalDate fecha_actual=LocalDate.now();
        return Period.between(fecha,fecha_actual);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "fecha=" + fecha + '}';
    }
    
    
    
    
}
