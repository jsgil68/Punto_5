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
public class Pregrado {

    Scanner sc = new Scanner(System.in);
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
    //Pedir notas y calcular el promedio
    public void calcularPromedio() {
        //Pedir nota de calculo
        System.out.print("Digite su nota de calculo: ");
        Calculo = sc.nextDouble();
        //si la nota no esta entre 1 y 5 le volvera a pedir la nota 
        while (Calculo < 1 || Calculo > 5) {
            System.out.println("¡La nota ingresada no esta entre el rango de calificacion");
            System.out.println(" ");
            System.out.print("Digite su nota de calculo: ");
            Calculo = sc.nextDouble();
        }
        System.out.println(" ");
        //Pedir nota de fisica
        System.out.print("Digite su nota de fisica: ");
        Fisica = sc.nextDouble();
        //si la nota no esta entre 1 y 5 le volvera a pedir la nota 
        while (Fisica < 1 || Fisica > 5) {
            System.out.println("¡La nota ingresada no esta entre el rango de calificacion");
            System.out.println(" ");
            System.out.print("Digite su nota de fisica: ");
            Fisica = sc.nextDouble();
        }
        System.out.println(" ");
        //Pedir nota de Estadistica
        System.out.print("Digite su nota de estadistica: ");
        Estadistica = sc.nextDouble();
        //si la nota no esta entre 1 y 5 le volvera a pedir la nota 
        while (Estadistica < 1 || Estadistica > 5) {
            System.out.println("¡La nota ingresada no esta entre el rango de calificacion");
            System.out.println(" ");
            System.out.print("Digite su nota de estadistica: ");
            Estadistica = sc.nextDouble();
        }
        System.out.println(" ");
        //calcula el promedio de las tres asignaturas
        Promedio = (Calculo + Estadistica + Fisica) / 3;
        System.out.println("promedio es: " + Promedio);
    }

    //calcula e imprime los creditos 
    public void numeroCreditos() {
        //Calcular creditos de 4.5 o mayor
        if (Promedio >= 4.5) {
            //Pregunta cuantos creditos desea registrar
            System.out.println("El total de creditos que puede cursar son: 28 ");
            System.out.println("Se le realizara un descuento del 25% sobre el total de su matricula ");
            System.out.println("Cuantos creditos desea registrar?: ");
            Creditos = sc.nextDouble();
            //si es 0 la cantidad se supondra que querra cancelar la matriculacion
            while (Creditos <= 0 || Creditos > 28) {
                do {
                    if (Creditos <= 0) {
                        System.out.println("Desea no matricularse para el siguiente semestre?");
                        System.out.println("1.Si / 2.No");
                        Cancelar = sc.nextDouble();
                        //se verifica si desea cancelar la matriculacion
                        if (Cancelar == 1) {
                            System.out.print("Deacuerdo, usted no estara matriculado para el siguiente semestre");
                            System.exit(0);
                        } else {
                            if (Cancelar == 2) {
                                System.out.println("Cuantos creditos desea registrar?: ");
                                Creditos = sc.nextDouble();
                            }
                        }
                    }
                    if (Creditos > 28) {
                        System.out.println("¡La cantidad de creditos es mayor a la que puede registrar");
                        System.out.println(" ");
                        System.out.print("Cuantos creditos desea registrar?: ");
                        Creditos = sc.nextDouble();
                    }
                } while (Creditos <= 0 || Creditos > 28);

            }

            //se verifica si la cantidad de creditos es mayor a la que puede registrar
            //si es mayor se le vuelve a preguntar la cantidad de creditos
            //calculo de el valor de la matricula
            Total = Creditos * 40000;
            Matricula = Total * 0.75;

        }
        //procedimiento del rango de creditos de 4 a 4.5
        if (Promedio >= 4 && Promedio < 4.5) {
            //Pregunta cuantos creditos desea registrar
            System.out.println("El total de creditos que puede cursar son: 25 ");
            System.out.println("Se le realizara un descuento del 10% sobre el total de su matricula ");
            System.out.println("Cuantos creditos desea registrar?: ");
            Creditos = sc.nextDouble();
            //si es 0 la cantidad se supondra que querra cancelar la matriculacion
            while (Creditos <= 0 || Creditos > 25) {
                do {
                    if (Creditos <= 0) {
                        System.out.println("Desea no matricularse para el siguiente semestre?");
                        System.out.println("1.Si / 2.No");
                        Cancelar = sc.nextDouble();
                        //se verifica si desea cancelar la matriculacion
                        if (Cancelar == 1) {
                            System.out.print("Deacuerdo, usted no estara matriculado para el siguiente semestre");
                            System.exit(0);
                        } else {
                            if (Cancelar == 2) {
                                System.out.println("Cuantos creditos desea registrar?: ");
                                Creditos = sc.nextDouble();
                            }
                        }
                    }
                    //se verifica si ingreso mas creditos de los que debia
                    if (Creditos > 25) {
                        System.out.println("¡La cantidad de creditos es mayor a la que puede registrar");
                        System.out.println(" ");
                        System.out.print("Cuantos creditos desea registrar?: ");
                        Creditos = sc.nextDouble();
                    }
                } while (Creditos <= 0 || Creditos > 25);

            }
            //calculo de el valor de la matricula
            Total = Creditos * 40000;
            Matricula = Total * 0.90;

        }
        //procedimiento del rango de creditos de 3.5 a 4
        if (Promedio >= 3.5 && Promedio < 4) {
            //Pregunta cuantos creditos desea registrar
            System.out.println("El total de creditos que puede cursar son: 20 ");
            System.out.println("Se le realizara un descuento del 0% sobre el total de su matricula ");
            System.out.println("Cuantos creditos desea registrar?: ");
            Creditos = sc.nextDouble();
            //si es 0 la cantidad se supondra que querra cancelar la matriculacion
            while (Creditos <= 0 || Creditos > 20) {
                do {
                    if (Creditos <= 0) {
                        System.out.println("Desea no matricularse para el siguiente semestre?");
                        System.out.println("1.Si / 2.No");
                        Cancelar = sc.nextDouble();
                        //se verifica si desea cancelar la matriculacion
                        if (Cancelar == 1) {
                            System.out.print("Deacuerdo, usted no estara matriculado para el siguiente semestre");
                            System.exit(0);
                        } else {
                            if (Cancelar == 2) {
                                System.out.println("Cuantos creditos desea registrar?: ");
                                Creditos = sc.nextDouble();
                            }
                        }
                    }
                    //se verifica si ingreso mas creditos de los que debia
                    if (Creditos > 20) {
                        System.out.println("¡La cantidad de creditos es mayor a la que puede registrar");
                        System.out.println(" ");
                        System.out.print("Cuantos creditos desea registrar?: ");
                        Creditos = sc.nextDouble();
                    }
                } while (Creditos <= 0 || Creditos > 20);

            }
            //calculo de el valor de la matricula
            Matricula = Creditos * 40000;

        }
        //procedimiento del rango de creditos de 2.5 a 3.5
        if (Promedio >= 2.5 && Promedio < 3.5) {
            //Pregunta cuantos creditos desea registrar
            System.out.println("El total de creditos que puede cursar son: 15 ");
            System.out.println("Se le realizara un descuento del 0% sobre el total de su matricula ");
            System.out.println("Cuantos creditos desea registrar?: ");
            Creditos = sc.nextDouble();
            //si es 0 la cantidad se supondra que querra cancelar la matriculacion
            while (Creditos <= 0 || Creditos > 15) {
                do {
                    if (Creditos <= 0) {
                        System.out.println("Desea no matricularse para el siguiente semestre?");
                        System.out.println("1.Si / 2.No");
                        Cancelar = sc.nextDouble();
                        //se verifica si desea cancelar la matriculacion
                        if (Cancelar == 1) {
                            System.out.print("Deacuerdo, usted no estara matriculado para el siguiente semestre");
                            System.exit(0);
                        } else {
                            if (Cancelar == 2) {
                                System.out.println("Cuantos creditos desea registrar?: ");
                                Creditos = sc.nextDouble();
                            }
                        }
                    }
                    //se verifica si ingreso mas creditos de los que debia
                    if (Creditos > 15) {
                        System.out.println("¡La cantidad de creditos es mayor a la que puede registrar");
                        System.out.println(" ");
                        System.out.print("Cuantos creditos desea registrar?: ");
                        Creditos = sc.nextDouble();
                    }
                } while (Creditos <= 0 || Creditos > 15);

            }
            //calculo de el valor de la matricula
            Matricula = Creditos * 40000;

        }
    }

    public void totalFinales() {
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
