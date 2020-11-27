package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList numeros = new ArrayList();

        for(int i=0;i<5;i++) {
            numeros.add(i);
        }
        System.out.println("Numeros antes de la insercion:");
        System.out.println("Tamaño de la lista: "+numeros.size());
        for(int i=0;i<numeros.size();i++) { //mostrar antes de agregar elementos
            System.out.println(numeros.get(i));
        }
        numeros.add(0,100);
        numeros.add(100);

        System.out.println("Numeros despues de la insercion:");
        System.out.println("Tamaño de la lista: "+numeros.size());
        for(int i=0;i<numeros.size();i++) { //mostrar antes de agregar elementos
            System.out.println(numeros.get(i));
        }
    }
}
