/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.parcial2A;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

/**
 *
 * @author alopez
 */
public class LiquidacionEmpresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<NivelAcademico>();
        NivelAcademico na = new NivelAcademico(10, "Secundario Completo", 10);
        nivelesAcademicos.add(na);
        na = new NivelAcademico(20, "Universitario Completo", 30);
        nivelesAcademicos.add(na);
        na = new NivelAcademico(30, "Maestría Completo", 40);
        nivelesAcademicos.add(na);
        na = new NivelAcademico(40, "Doctorando Completo", 50);
        nivelesAcademicos.add(na);

        Empresa empresa = new Empresa();

        System.out.println("Ingrese los datos de la empresa");
        while (true) {
            System.out.println("Ingrese razon social");
            String razonSocial = sc.nextLine();

            try {
                if (razonSocial.isEmpty() || razonSocial.isBlank()) {
                    System.out.println("Por favor, ingrese un valor");
                } else {
                    empresa.setRazonSocial(razonSocial);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Ingrese un valor valido");
                sc.close();
            }
        }
        while (true) {
            System.out.println("Ingrese cuit");
            String cuit = sc.nextLine();

            try {
                if (cuit.length() != 11) {
                    System.out.println("Por favor, ingrese un valor de 11 digitos");
                } else {
                    empresa.setCuit(cuit);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Ingrese un valor valido");
                sc.close();
            }
        }
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        HashSet<String> legajos = new HashSet<>();
        while (true) {
            Empleado empleado = new Empleado();
            System.out.println("Ingrese los datos del empleado a cargar");
            System.out.println("Nombre completo");

            while (true) {
                String nombreCompleto = sc.nextLine();
                try {
                    if (nombreCompleto.isEmpty() || nombreCompleto.isBlank()) {
                        System.out.println("Intente de nuevo ingresando un valor");
                    } else {
                        empleado.setNombreCompleto(nombreCompleto);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor válido");
                }
            }
            System.out.println("Ingrese legajo");
            while (true) {
                String legajo = sc.nextLine();
                try {
                    if (legajo.isEmpty() || legajo.isBlank()) {
                        System.out.println("Intente de nuevo ingresando un valor");
                    } else if (legajos.contains(legajo)) {
                        System.out.println("El legajo ingresado ya fue cargado anteriormente");
                    } else {
                        empleado.setLegajo(Integer.parseInt(legajo));
                        legajos.add(legajo);
                        break;

                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor válido");
                }
            }

            System.out.println("Ingrese sueldo básico");
            while (true) {
             
                try {
                    double sueldo = Double.parseDouble(sc.nextLine());   
                    if (sueldo < 0) {
                        System.out.println("Intente de nuevo ingresando un valor mayor a 0");
                    } else {
                        empleado.setSalario(sueldo);
                        break;

                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor valido");
                    
                }
            }

            //Buscamos el codigo
            while (true) {
                System.out.println("Ingrese codigo de nivel educativo");
                int codigo = Integer.parseInt(sc.nextLine());
                try {
                    boolean encontrado = false;
                    for (NivelAcademico nivel : nivelesAcademicos) {
                        if (nivel.getCodigo() == codigo) {
                            empleado.setNivelAcademico(nivel);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El código ingresado no existe, intente nuevamente");
                    } else break;
                } catch (Exception e) {
                    System.out.println("Ingrese un valor válido");
                       sc.close();

                }
            }
                System.out.println(empleado.salarioTotalCalculado());
            empleados.add(empleado);
            
            empresa.setEmpleados(empleados);
            
        
            System.out.println("Desea ingresar un nuevo empleado? SI/NO");
            String option = sc.nextLine();
            if(option.equalsIgnoreCase("NO"))break;
            
        }
        
        empresa.mostrarBono();
        empresa.resumen();
        
        //Hasta acá llega el archivo main  
    }

}
