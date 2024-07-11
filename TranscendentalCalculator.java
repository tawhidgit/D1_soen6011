package soen6011D1;

import java.util.Scanner;

public class TranscendentalCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Transcendental Calculator for B(x,y) ");
        
        System.out.println("Please enter value for x:");
        double x = getInput(scanner);
        
        System.out.println("Please enter value for y:");
        double y = getInput(scanner);
        
        System.out.println("Let's assume B(x, y) = sin(x) + cos(y)");
        
        double result = calculateB(x, y);
        System.out.println("The result of B(" + x + ", " + y + ") is : " + result);
    }
    
    private static double getInput(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
    
    private static double calculateB(double x, double y) {
        // Implement the mathematical form of B(x, y) here.
        // For illustration purposes, let's assume B(x, y) = sin(x) + cos(y)
        return Math.sin(x) + Math.cos(y);
    }
}

