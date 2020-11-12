package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nombre = "a";
        System.out.println("Ingrese una palabra: ");
        nombre = sc.nextLine();

	    int longitud = nombre.length();

	    for(int i=0; i<longitud; i++){
	        char cambio = nombre.charAt(i);
	        int ascii = (int) cambio - 32;
	        char letra = (char) ascii;
            System.out.print(letra);
        }
    }
}
