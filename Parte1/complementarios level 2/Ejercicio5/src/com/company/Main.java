package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> horas = new ArrayList();
        ArrayList<Integer> valor = new ArrayList();
        ArrayList<Integer> total = new ArrayList();
        int suma = 0;


        for(int i=0;i<5;i++){
            System.out.println("Ingrese horas trabajadas para el dia "+(i+1)+":");
            int hora = sc.nextInt();
            System.out.println("Ingrese el valor por hora para el dia "+(i+1)+":");
            int val = sc.nextInt();
            horas.add(hora);
            valor.add(val);
        }

        for(int i=0;i<5;i++){
            int tot = horas.get(i) * valor.get(i);
            total.add(tot);
            suma = suma + tot;
        }

        System.out.println(total.toString());
        System.out.println("Total Final: $"+suma);

    }
}
