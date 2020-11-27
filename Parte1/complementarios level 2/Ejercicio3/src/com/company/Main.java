package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList baraja = new ArrayList();

        for(int j=0;j<4;j++) {
            for (int i = 0; i < 13; i++) {
                if (i <= 9) {
                    baraja.add((i + 1));
                } else {
                    if (i == 10) {
                        baraja.add("J");
                    } else if (i == 11) {
                        baraja.add("Q");
                    } else {
                        baraja.add("K");
                    }
                }
            }
        }
        System.out.println("tamaño de la baraja: "+baraja.size());
        System.out.println("Impresion baraja en orden: ");
        for(int i=0;i<baraja.size();i++){
            System.out.println(baraja.get(i));
        }

        System.out.println("Impresion baraja en inversa: ");
        for(int i=baraja.size()-1;i>=0;i--){
            System.out.println(baraja.get(i));
        }

        Collections.shuffle(baraja);  //mezcla

        System.out.println("Impresion baraja en desordenada: ");
        for(int i=0;i<52;i++){
            System.out.println(baraja.get(i));
        }

    }
}
