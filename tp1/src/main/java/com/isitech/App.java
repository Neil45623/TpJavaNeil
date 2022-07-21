package com.isitech;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int number = 0;

        do {
            System.out.println("Deviner le nombre entre (1 et 100)");
            number = sc.nextInt();

            if (number == randomNumber) {
                System.out.println("Félicitation !");
                break;
            } else if (number > randomNumber) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("C'est plus !");
            }
        } while (number >= 0);

        System.out.println("El famose nombre esta :");
        System.out.println(randomNumber);
        sc.close();
    }
}
