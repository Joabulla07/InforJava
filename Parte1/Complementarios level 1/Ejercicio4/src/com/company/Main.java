package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero para calcular factorial: ");
	    int nro = sc.nextInt();
	    int fact = 1;

	    for(int i = 1; i <= nro; i++){
            fact = fact * i;
        }

        System.out.println("El factorial es: "+fact);
    }
}
