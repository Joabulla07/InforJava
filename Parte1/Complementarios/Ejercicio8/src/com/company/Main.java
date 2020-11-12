package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Edad: ");
        String edad = sc.nextLine();
        System.out.println("Ingrese direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);
    }
}
