package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // printing out text menu
        System.out.println("Please enter the number of your selection");
        System.out.println("");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle ");
        System.out.println("4. Parallelogram");

        //calling methods through switch-case

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()){

            case 1:
                double tri_area = Triangle_area();
                System.out.println("The area of the triangle is:  " + tri_area);
                break;
            case 2:
                double rect_area = Rectangle_area();
                System.out.println("The area of the rectangle is:  " + rect_area);
                break;
            case 3:
                double circ_area = circle_area();
                System.out.println("The area of the circle is:  " + circ_area);
                break;
            case 4:
                double parall_area = parallelo_area();
                System.out.println("The area of the parallelogram is:  " + parall_area);

            default:
                System.out.println("Error: Invalid User Entry.");
        }

    }
    private static double Triangle_area(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the base");
        double base = scanner.nextInt();

        System.out.println("Enter the height of the triangle");
        double height = scanner.nextInt();

        return 0.5 * base * height;
    }
    private static double Rectangle_area(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextInt();
        System.out.println("Enter the length: ");
        double length = scanner.nextInt();

        return length * width;
    }
    private static double circle_area(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextInt();

        return (radius * radius) * (Math.PI);

    }
    private static double parallelo_area(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the base:  ");
        double length = scanner.nextInt();

        System.out.println("Enter the vertical height: ");
        double height = scanner.nextInt();

        return length * height;
    }
}
