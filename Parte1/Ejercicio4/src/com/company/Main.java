package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Ingrese un entero: ");
	    int dia = sc.nextInt();

	    switch(dia){
            case 1: System.out.println("Domingo");
                    break;
            case 2: System.out.println("Lunes");
                    break;
            case 3: System.out.println("Martes");
                    break;
            case 4: System.out.println("Miercoles");
                    break;
            case 5: System.out.println("Jueves");
                    break;
            case 6: System.out.println("Viernes");
                    break;
            case 7: System.out.println("Sabado");
                    break;
                default: System.out.println("Error! El numero no puede ser transformado a dia de la semana.");
        }
    }
}
