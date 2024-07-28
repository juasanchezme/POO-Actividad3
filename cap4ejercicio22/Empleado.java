package com.mycompany.cap4ejercicio22;

public class Empleado {
    String nombre;
    int horas_trabajadas;
    double salario_hora,salario_mensual;
    
    Empleado(String nombre, int horas_trabajadas, double salario_hora){
        this.nombre=nombre;
        this.horas_trabajadas=horas_trabajadas;
        this.salario_hora=salario_hora;

    }
    Double CalcularSalarioMensual(){
       salario_mensual=horas_trabajadas*salario_hora;
       return salario_mensual;
    }
    
    String Resultado(){
        
         if (CalcularSalarioMensual()>450000){
            return ("Nombre del empleado: "+ nombre + "\n"  +"Salario mensual: " +CalcularSalarioMensual());          
        }
        else{
            return ("Nombre del empleado:"+ nombre);
        }
  }
}

