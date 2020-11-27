package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor mayor al primero: ");
        int num2 = sc.nextInt();
        String lista1[];
        lista1 = fizzBuzzFuncion(num1,num2);

        for(int i=0;i< lista1.length;i++){
            System.out.println(lista1[i]);
        }
    }

    public static String[] fizzBuzzFuncion(int num1, int num2){
        String lista[] = new String[num2];
        for(int i=num1;i<num2;i++){
            if(i%2 ==0 && i%3 != 0){
                lista[i-num1] = "Fizz";
            }
            else if(i%3 == 0 && i%2 !=0){
                lista[i-num1] = "Buzz";
            }
            else if((i%2 ==0) && (i%3==0)){
                lista[i-num1] = "FizzBuzz";
            }
            else{
                lista[i-num1] = ""+i;
            }

        }
        return lista;
    }
}
