package Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choice the action:");
        System.out.println("1. Miles to kilometers");
        System.out.println("2. Kilometers to miles");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertMilesToKilometers();
                break;
            case 2:
                convertKilometersToMiles();
                break;
            default:
                System.out.println("Incorrect choice. Please choice the action 1 or 2.");
        }

        scanner.close();
    }
    private static void convertMilesToKilometers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance by miles: ");
        double miles = scanner.nextDouble();

        double kilometers = milesToKilometers(miles);

        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }
        private static void convertKilometersToMiles() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance by kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometersToMiles(kilometers);

        System.out.println(kilometers + " kilometers = " + miles + " miles");
    }

    private static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
