package com.mycompany.cap4ejercicio7;

public class Datos {
    
    public double A;
    public double B;
    
    public Datos(double A,double B) {
    this.A = A;
    this.B = B;
    }
  
    String capturarDatos() {

         // Comparar A y B 
         if (A > B) {
            return ("A es mayor que B");
        } else if (A == B) {
            return ("A es igual que B");
        } else {
            return ("A es menor que B");
        }


    }
}