/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Datos {

    Scanner teclado = new Scanner(System.in);
//Atributos
    private String Nombre;
    private int Edad;
    private int Codigo;

    //Metodos
    //Leer datos
    public void lecturaDatos() {
//pide el nombre de el estudiante
        System.out.print("Introduzca su nombre: ");
        Nombre = teclado.nextLine();
        System.out.println(" ");
        //pide la edad del estudiante
        // se le agrago un rango a la edad no puede ser menor o igual a cero, ya que no hay edades negativas
        System.out.print("Introduzca su edad: ");
        Edad = teclado.nextInt();
        while (Edad < 1) {
            if (Edad < 0) {
                System.out.println("¡La edad del estudiante no puede ser negativa");
                System.out.println(" ");
            } else {
                if (Edad == 0) {
                    System.out.println("¡La edad del estudiante es muy baja");
                    System.out.println(" ");
                }
            }
            System.out.print("Introduzca una edad valida: ");
            Edad = teclado.nextInt();
        }

        System.out.println(" ");
        System.out.print("Introduzca su codigo: ");
        Codigo = teclado.nextInt();
        while (Codigo < 10000 || Codigo > 99999) {
            if (Codigo < 10000) {
                System.out.println("El codigo es muy corto");
                System.out.println(" ");
            } else {
                if (Codigo > 99999) {
                    System.out.println("el codigo es muy largo");
                    System.out.println(" ");
                }
            }
            System.out.print("Introduzca su codigo: ");
            Codigo = teclado.nextInt();

        }
    }
//imprimir datos

    public void impresionDatos() {
        System.out.println("Nombre del estudiante: " + Nombre);
        System.out.println("Edad del estudiante: " + Edad);
        System.out.println("Codigo del estudiante: " + Codigo);
    }
}
