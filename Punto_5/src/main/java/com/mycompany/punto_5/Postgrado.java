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
public class Postgrado {
//scanner

    Scanner sca = new Scanner(System.in);
    //Atributos 
    private double Calculo;
    private double Fisica;
    private double Estadistica;
    private double Promedio;
    private double Matricula;
    private double Creditos;
    private double Cancelar;
    private double Total;

    //Metodos
    //pide notas y calcula promedio
    public void promedioPostgrado() {
        //Pedir nota de calculo
        System.out.print("Digite su nota de calculo: ");
        Calculo = sca.nextDouble();
        //si la nota no esta entre 1 y 5 le volvera a pedir la nota 
        while (Calculo < 1 || Calculo > 5) {
            System.out.println("¡La nota ingresada no esta entre el rango de calificacion");
            System.out.println(" ");
            System.out.print("Digite su nota de calculo: ");
            Calculo = sca.nextDouble();
        }
        System.out.println(" ");
        //Pedir nota de fisica
        System.out.print("Digite su nota de fisica: ");
        Fisica = sca.nextDouble();
        //si la nota no esta entre 1 y 5 le volvera a pedir la nota 
        while (Fisica < 1 || Fisica > 5) {
            System.out.println("¡La nota ingresada no esta entre el rango de calificacion");
            System.out.println(" ");
            System.out.print("Digite su nota de fisica: ");
            Fisica = sca.nextDouble();
        }
        System.out.println(" ");
        //Pedir nota de Estadistica
        System.out.print("Digite su nota de estadistica: ");
        Estadistica = sca.nextDouble();
        //si la nota no esta entre 1 y 5 le volvera a pedir la nota 
        while (Estadistica < 1 || Estadistica > 5) {
            System.out.println("¡La nota ingresada no esta entre el rango de calificacion");
            System.out.println(" ");
            System.out.print("Digite su nota de estadistica: ");
            Estadistica = sca.nextDouble();
        }
        System.out.println(" ");
        //calcula el promedio de las tres asignaturas
        Promedio = (Calculo + Estadistica + Fisica) / 3;
        //imprime el promedio
        System.out.println("su promedio es: " + Promedio);
    }

    //calcula los creditos y precio de la matricula
    public void creditosPostgrado() {
        //Calcular creditos de 4.5 o mayor
        if (Promedio >= 4.5) {
            //Pregunta cuantos creditos desea registrar
            System.out.println("El total de creditos que puede cursar son: 20 ");
            System.out.println("Se le realizara un descuento del 20% sobre el total de su matricula ");
            System.out.println("Cuantos creditos desea registrar?: ");
            Creditos = sca.nextDouble();
            //si es 0 la cantidad se supondra que querra cancelar la matriculacion
            //si es mayor a la cantidad maxima de creditos no lo dejara matricular creditos
            while (Creditos <= 0 || Creditos > 20) {
                do {
                    if (Creditos <= 0) {
                        System.out.println("Desea no matricularse para el siguiente semestre?");
                        System.out.println("1.Si / 2.No");
                        Cancelar = sca.nextDouble();
                        //se verifica si desea cancelar la matriculacion
                        if (Cancelar == 1) {
                            System.out.print("Deacuerdo, usted no estara matriculado para el siguiente semestre");
                            System.exit(0);
                        } else {
                            if (Cancelar == 2) {
                                System.out.println("Cuantos creditos desea registrar?: ");
                                Creditos = sca.nextDouble();
                            }
                        }
                    }
                    if (Creditos > 20) {
                        System.out.println("¡La cantidad de creditos es mayor a la que puede registrar");
                        System.out.println(" ");
                        System.out.print("Cuantos creditos desea registrar?: ");
                        Creditos = sca.nextDouble();
                    }
                } while (Creditos <= 0 || Creditos > 20);

            }

            //se verifica si la cantidad de creditos es mayor a la que puede registrar
            //si es mayor se le vuelve a preguntar la cantidad de creditos
            //calculo de el valor de la matricula
            Total = Creditos * 200000;
            Matricula = Total * 0.80;

        }

        if (Promedio >= 2.5 && Promedio < 4.5) {
            //Pregunta cuantos creditos desea registrar
            System.out.println("El total de creditos que puede cursar son: 10 ");
            System.out.println("Se le realizara un descuento del 0% sobre el total de su matricula ");
            System.out.println("Cuantos creditos desea registrar?: ");
            Creditos = sca.nextDouble();
            //si es 0 la cantidad se supondra que querra cancelar la matriculacion
            //si es mayor a la cantidad maxima de creditos no lo dejara matricular creditos
            while (Creditos <= 0 || Creditos > 10) {
                do {
                    if (Creditos <= 0) {
                        System.out.println("Desea no matricularse para el siguiente semestre?");
                        System.out.println("1.Si / 2.No");
                        Cancelar = sca.nextDouble();
                        //se verifica si desea cancelar la matriculacion
                        if (Cancelar == 1) {
                            System.out.print("Deacuerdo, usted no estara matriculado para el siguiente semestre");
                            System.exit(0);
                        } else {
                            if (Cancelar == 2) {
                                System.out.println("Cuantos creditos desea registrar?: ");
                                Creditos = sca.nextDouble();
                            }
                        }
                    }
                    if (Creditos > 10) {
                        System.out.println("¡La cantidad de creditos es mayor a la que puede registrar");
                        System.out.println(" ");
                        System.out.print("Cuantos creditos desea registrar?: ");
                        Creditos = sca.nextDouble();
                    }
                } while (Creditos <= 0 || Creditos > 10);

            }
            //calculo de el valor de la matricula
            Matricula = Creditos * 200000;

        }

        //se supuso que en el postagrado tambien se pierde con un promedio menor a 2.5
        if (Promedio < 2.5) {

        }

    }

    public void datosFinales() {
        if (Promedio >= 2.5) {
            System.out.println("el total de creditos matriculados fue de " + Creditos + " creditos.");
            System.out.println("Su matricula cuesta: $" + Total);
            System.out.println("Aplicando el descuento, el valor de su matricula es: $" + Matricula);
        }
        if (Promedio < 2.5) {
            System.out.println("Usted este semestre obtuvo un promedio de: " + Promedio);
            System.out.println("y por politicas de la universidad los promedios menores a 2.5 no pueden continuar.");
        }
    }
}
