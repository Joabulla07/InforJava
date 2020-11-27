package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList estudiantes = new ArrayList();
        ArrayList quimica = new ArrayList();
        ArrayList matematica = new ArrayList();
        ArrayList fisica = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int j=12;

        for(int i=0;i<j;i++){
            System.out.println("Ingrese un nombre: ");
            String estud = sc.nextLine();
            estudiantes.add(estud);
        }
        List listaQuim = estudiantes.subList(0,4); //no incluye la posicion 4
        List listaMat = estudiantes.subList(4,8);
        List listaFis = estudiantes.subList(8,12);

        quimica.addAll(listaQuim);
        matematica.addAll(listaMat);
        fisica.addAll(listaFis);

        System.out.println("MATEMATICA");
        for(int i=0;i<matematica.size();i++){
            System.out.println(matematica.get(i));
        }
        System.out.println("QUIMICA");
        for(int i=0;i<quimica.size();i++){
            System.out.println(quimica.get(i));
        }
        System.out.println("FISICA");
        for(int i=0;i<fisica.size();i++){
            System.out.println(fisica.get(i));
        }

    }
}
