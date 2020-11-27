package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nombre;

        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Hola "+nombre);
    }
}
