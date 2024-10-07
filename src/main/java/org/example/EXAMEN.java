package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMEN {
    public void ejercicio_1() {

        Scanner teclado = new Scanner(System.in);
        boolean a = true;
        while (a) {
            try {
                System.out.println("Introduce un número");
                int num = teclado.nextInt();
                if (num < 0) {
                    System.out.println("El valor absoluto es " + num * -1);
                    a = false;
                } else {
                    System.out.println("El valor absoluto es " + num);
                    a = false;
                }
            } catch (InputMismatchException err) {
                System.out.println("ERROR. Introduce un número válido.");
                teclado.nextLine();
            }


        }


    }

    //public void ejercicio_2() {
   // }
}




