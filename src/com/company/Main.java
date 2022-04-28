package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0;

        while (true){

            int temp = counter + 1;
            System.out.print("Enter number #" + temp + ":");

            boolean isInt = scanner.hasNextInt();

            if (isInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;

                if (counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();

        }

        System.out.println("sum = " + sum);
        scanner.close();

    }
}
