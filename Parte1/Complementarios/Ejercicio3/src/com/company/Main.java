package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int nro = sc.nextInt();

        for(int i = 1;i <= nro; i++ ){
            for(int j=1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
