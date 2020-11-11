package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para la tabla: ");
        int nro = sc.nextInt();

        for(int i=0; i<= 10; i++){
            System.out.println(nro + " * " + i + " = "+nro*i);
        }
    }
}
