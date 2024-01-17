package by.it_academy_homework2.tasks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //найти вещественные корни квадратного уравнения ax^2+bx+c=0 либо сообщить , что их нет
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        printRootsOfEquation(a, b, c);
    }

    public static void printRootsOfEquation(int a, int b, int c) {
        int discrim = b * b - 4 * a * c;
        if (discrim < 0) {
            System.out.println("Quadratic equation has no roots");
        } else if (discrim == 0) {
            double x = -(double) b / (2 * a);
            System.out.println("Quadratic equation has one root: " + x);
        } else {
            double x1 = ((-b) + Math.sqrt(discrim)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(discrim)) / (2 * a);
            System.out.println("Quadratic equation has two roots: " + x1 + " and " + x2);
        }
    }
}

