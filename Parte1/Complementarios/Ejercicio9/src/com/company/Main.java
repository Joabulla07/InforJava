package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una oracion: ");
        String oracion = sc.nextLine();
        System.out.println("Ingrese letra a buscar");
        char letra = sc.next().charAt(0);
        int cont=0;
        int longitud = oracion.length();


        for(int i=0; i<longitud; i++){
            char buscar = oracion.charAt(i);
            if(buscar == letra){
                cont++;
            }
        }

        System.out.println("Hay "+cont+" letras "+letra);
    }
}
