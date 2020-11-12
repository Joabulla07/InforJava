package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        int suma =0;

        for(int i = 0; i < b; i++){
            suma = suma + a;
        }

        System.out.println(a+" * "+b+" = "+suma);
    }
}
