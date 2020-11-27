package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado e1 = new Empleado("joanna",947289,8,50 );
        Empleado e2 = new Empleado("julio",9472,9,50 );

        Set<Empleado> personas = new HashSet();

        personas.add(e2);
        personas.add(e1);


        Map mapEmp = new HashMap();

        for(Empleado e: personas){
            mapEmp.put(e.getDni(), e.getSueldo());
        }

        System.out.println(mapEmp);

    }
}
