// CMSC 335
// Project 1
// Evan Martin
// January 26, 2021

//Main.java
// This class creates a command line prompt that allows user to
// build various 2d and 3d shapes and have their respective areas or volumes
// calculated for them.

package project1;

import java.util.Scanner;
import java.util.Date;

public class Main {

    static String selection;
    static Scanner scanner = new Scanner(System.in);

    static void checkInput() {
        while (!scanner.hasNextFloat()) {
            scanner.nextLine();
            scanner.nextLine();
            System.out.print("Please enter a floating point number: \n");
        }
    }

    public static void main(String[] args) {

        System.out.println("****Welcome to the Java OO Shapes Program****");

        do {
            System.out.println("\nSelect from the menu below \n");
            System.out.print(
                    """
                            1. Construct a Circle
                            2. Construct a Rectangle
                            3. Construct a Square
                            4. Construct a Triangle
                            5. Construct a Sphere
                            6. Construct a Cube
                            7. Construct a Cone
                            8. Construct a Cylinder
                            9. Construct a Torus
                            10. Exit the program

                            """
            );
            selection = scanner.next();
            switch (selection) {
                case "1" -> {
                    System.out.println("Enter radius of Circle: ");
                    checkInput();
                    float radius = scanner.nextFloat();
                    Circle circle = new Circle(radius);
                    System.out.print("Area of the Circle is: ");
                    System.out.printf("%.2f%n", circle.getArea());
                }
                case "2" -> {
                    System.out.println("Enter length of rectangle: ");
                    checkInput();
                    float length = scanner.nextInt();
                    System.out.println("Enter width of rectangle: ");
                    checkInput();
                    float width = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.print("Area of the Rectangle is: ");
                    System.out.printf("%.2f%n", rectangle.getArea());
                }
                case "3" -> {
                    System.out.println("Enter length of Square: ");
                    checkInput();
                    float length = scanner.nextInt();
                    Square square = new Square(length);
                    System.out.print("Area of the Square is: ");
                    System.out.printf("%.2f%n", square.getArea());
                }
                case "4" -> {
                    System.out.println("Enter base of Triangle: ");
                    checkInput();
                    float base = scanner.nextInt();
                    System.out.println("Enter height of Triangle: ");
                    checkInput();
                    float height = scanner.nextInt();
                    Triangle triangle = new Triangle(base, height);
                    System.out.print("Area of the Triangle is: ");
                    System.out.printf("%.2f%n", triangle.getArea());
                }
                case "5" -> {
                    System.out.println("Enter radius of Sphere: ");
                    checkInput();
                    float radius = scanner.nextInt();
                    Sphere sphere = new Sphere(radius);
                    System.out.print("Volume of the Sphere is: ");
                    System.out.printf("%.2f%n", sphere.getVolume());
                }
                case "6" -> {
                    System.out.println("Enter length of Cube: ");
                    checkInput();
                    float length = scanner.nextInt();
                    Cube cube = new Cube(length);
                    System.out.print("Volume of the Cube is: ");
                    System.out.printf("%.2f%n", cube.getVolume());
                }
                case "7" -> {
                    System.out.println("Enter radius of Cone: ");
                    checkInput();
                    float radius = scanner.nextInt();
                    System.out.println("Enter height of Cone: ");
                    checkInput();
                    float height = scanner.nextInt();
                    Cone cone = new Cone(radius, height);
                    System.out.print("Volume of the Cone is: ");
                    System.out.printf("%.2f%n", cone.getVolume());
                }
                case "8" -> {
                    System.out.println("Enter radius of Cylinder: ");
                    checkInput();
                    float radius = scanner.nextInt();
                    System.out.println("Enter height of Cylinder: ");
                    checkInput();
                    float height = scanner.nextInt();
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.print("Volume of the Cylinder is: ");
                    System.out.printf("%.2f%n", cylinder.getVolume());
                }
                case "9" -> {
                    System.out.println("Enter major radius of Torus: ");
                    checkInput();
                    float majorRadius = scanner.nextInt();
                    System.out.println("Enter minor radius of Torus: ");
                    checkInput();
                    float radius = scanner.nextInt();
                    Torus torus = new Torus(majorRadius, radius);
                    System.out.print("Volume of the Torus is: ");
                    System.out.printf("%.2f%n", torus.getVolume());
                }
                case "10" -> {
                    Date d = new Date();
                    System.out.println("Thank you for using the program. Today is " + d);
                }
                default -> System.out.println("Invalid input enter 1 - 10\n");
            }
        } while (!selection.equals("10"));
    }
}
