/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_1_clases;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Semana_1_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creacion de instancias
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Scanner entrada = new Scanner(System.in);
//Inicialización de Variables de la clase Main
        int persona;
        persona = 0;
//Ingreso de Datos
        System.out.println("Ingrese el nombre de la persona: 1");
        estudiante1.nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido:");
        estudiante1.apellido = entrada.nextLine();
        System.out.println("Ingrese su cedula:");
        estudiante1.cedula = entrada.nextLine();
        System.out.println("Ingrese su edad");
        estudiante1.edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de la persona: 2");
        estudiante2.nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido:");
        estudiante2.apellido = entrada.nextLine();
        System.out.println("Ingrese su cedula:");
        estudiante2.cedula = entrada.nextLine();
        System.out.println("Ingrese su edad");
        estudiante2.edad = entrada.nextInt();

//Imprimir valores
        System.out.printf("%s\t%s\t%-10s\t%s\n", "Nombre", "Apellido", "Cedula", "Edad");
        System.out.printf("%s\t%-8s\t%-8s\t%d\n",estudiante1.nombre,estudiante1.apellido,estudiante1.cedula,estudiante1.edad);
        System.out.printf("%s\t%-8s\t%-8s\t%d\n",estudiante2.nombre,estudiante2.apellido,estudiante2.cedula,estudiante2.edad);

    }

}
