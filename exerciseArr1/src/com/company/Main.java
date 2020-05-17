package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int array[] = new int[10];
        int endValue;

        System.out.println("Ingresa los datos para el arreglo...");
        for(int i = 0; i<array.length; i++){
            System.out.print(i+". valor: ");
            array[i] = read.nextInt();
        }

        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }

        endValue = array[array.length-1];

        for(int i = array.length-2; i>=0; i--){
            array[i+1] = array[i];
        }

        /*for(int i = 0; i<array.length-1; i++){
            array[i+1] = array[i];
        }*/
        array[0] = endValue;
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
