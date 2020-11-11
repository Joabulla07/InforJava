package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int continuar = 1;
	    int nro;

	    while(continuar == 1){
            System.out.println("Por favor Ingrese un numero: ");
            nro = sc.nextInt();
            System.out.println("su numero es: "+nro);
            System.out.println("Si desea continuar presione 1, de lo contrario presione cualquier numero");
            continuar = sc.nextInt();
        }
    }
}
