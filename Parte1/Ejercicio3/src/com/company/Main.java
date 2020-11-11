package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int nota = sc.nextInt();

	    if(nota > 92){
            System.out.println("Exelente");
        }
	    else if(nota > 84){
            System.out.println("Sobresaliente");
        }
        else if(nota > 74){
            System.out.println("Distinguido");
        }
        else if(nota > 59){
            System.out.println("Bueno");
        }
        else{
            System.out.println("Desaprobado");
        }
    }
}
