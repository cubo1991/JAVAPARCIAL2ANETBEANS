/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial2A;

/**
 *
 * @author alopez
 */
public class Empleado {
    
  
    
    private String nombreCompleto;
    private int legajo;
    private double salario;
    private NivelAcademico nivelAcademico;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    
    public double salarioTotalCalculado(){
    double total = 0;
    
    total = this.salario + ( this.salario * (this.nivelAcademico.getPorcentajeAumento()/100) );
        
    
    return total;
    }
    
    
}
