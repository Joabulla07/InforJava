package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        int b = sc.nextInt();
        int potencia = 1;

        for(int i=0; i<b; i++){
            potencia = potencia*a;
        }

        System.out.println(a+" elevado a "+b+" = "+potencia);
    }
}
