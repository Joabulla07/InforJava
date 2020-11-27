package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList ciudades = new ArrayList();

        System.out.println("¿Cuantas ciudades desea ingresar?");
        int j = sc.nextInt();
        for (int i=0; i<j; i++){
            System.out.println("Ingrese la ciudad:");
            String ciudad = sc.next();
            ciudades.add(ciudad);
        }

        for (int i=0; i<j; i++){
            System.out.println("#"+(i+1)+" - "+ciudades.get(i));
        }
    }
}
