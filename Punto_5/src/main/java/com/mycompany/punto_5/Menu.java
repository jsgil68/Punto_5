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
public class Menu {

    Scanner teclado = new Scanner(System.in);
    Datos dat = new Datos();
    Pregrado pre = new Pregrado();
    Postgrado Post = new Postgrado();
    private int Grado;

    public void menuEjecucion() {
        System.out.println("      ..::MATRICULACION::..");
        System.out.println("Bienvenido al menu de maticulacion");
        System.out.println(" 1. Ingrese sus datos");

        dat.lecturaDatos();
        System.out.println(" 2. Usted a que grado pertenece?");
        System.out.println("    1. Pregrado");
        System.out.println("    2. Postgrado");
        System.out.print("Grado: ");
        Grado = teclado.nextInt();
        while (Grado < 1 || Grado > 2) {
            System.out.print("No ingreso el grado al que pertenece correctamente");
            Grado = teclado.nextInt();
        }
        if (Grado == 1) {
            pre.calcularPromedio();
            pre.numeroCreditos();
        }
        if (Grado == 2) {

            Post.promedioPostgrado();
            Post.creditosPostgrado();
        }
        if (Grado == 1) {
            System.out.println(" ");
            System.out.println("      ..::MATRICULACION::..");
            dat.impresionDatos();
            pre.totalFinales();
        }
        if (Grado == 2) {
            System.out.println(" ");
            System.out.println("      ..::MATRICULACION::..");
            Post.creditosPostgrado();
            Post.datosFinales();
        }
    }
}
