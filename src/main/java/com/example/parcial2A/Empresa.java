/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial2A;

import java.util.ArrayList;

/**
 *
 * @author alopez
 */
public class Empresa {

    private String cuit;
    private String razonSocial;
    private ArrayList<Empleado> empleados;
    private double promedio;
    private Empleado empleadoMejorSalario;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void mostrarBono (){
 
        double mejorSalario = 0;
        System.out.println("Empresa: " + this.razonSocial);
        System.out.println("CUIT: "+ this.cuit);
        System.out.println("------------------------Empleados------------------------------");
        for(Empleado empleado : this.empleados)
        {
            this.promedio += empleado.getSalario();
            if(mejorSalario < empleado.getSalario()){
                this.empleadoMejorSalario = empleado;
                mejorSalario = empleado.getSalario();
            }
            System.out.println("Nombre Completo: " + empleado.getNombreCompleto());
            System.out.println("Salario: "+ empleado.salarioTotalCalculado());
            System.out.println("Nivel Educativo: "+ empleado.getNivelAcademico().getNivel()+" "+ " (Porcentaje Aumento ("  + empleado.getNivelAcademico().getPorcentajeAumento() + "%))");
            System.out.println("---------------------------------------------------------------------");
        }
                
    }
    
    public void resumen(){
        System.out.println("Resumen");
        System.out.println("El promedio de los salarios de la empresa es: "+ this.promedio/this.empleados.size());
        System.out.println("El empleado con mejor salario es:");
           System.out.println("Nombre Completo: " + empleadoMejorSalario.getNombreCompleto());
            System.out.println("Salario: "+ empleadoMejorSalario.salarioTotalCalculado());
            System.out.println("Nivel Educativo: "+ empleadoMejorSalario.getNivelAcademico().getNivel()+" "+ " (Porcentaje Aumento ("  + empleadoMejorSalario.getNivelAcademico().getPorcentajeAumento() + "%))");
            System.out.println("---------------------------------------------------------------------");
        
    }
    
}
