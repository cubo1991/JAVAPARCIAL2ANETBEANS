/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial2A;

/**
 *
 * @author alopez
 */
public class NivelAcademico {
     private int codigo;
     private String nivel;
     private double porcentajeAumento;

    public NivelAcademico(int codigo, String nivel, double porcentajeAumento) {
        this.codigo = codigo;
        this.nivel = nivel;
        this.porcentajeAumento = porcentajeAumento;
    }
             

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }
    
    
    
}
