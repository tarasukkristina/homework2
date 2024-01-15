package by.it_academy_homework2.tasks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = scanner.nextInt();
        System.out.println("Enter a and b coordinates of the center: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter x and y coordinates of the point: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        pointInsideOrOutside(r, a, b, x, y);

    }

    public static void pointInsideOrOutside(int r, int a, int b, int x, int y) {
        int n = (x - a) * (x - a) + (y - b) * (y - b);
        int m = r * r;
        if (n == m) {
            System.out.println("The point inside circle");
        } else {
            System.out.println("The point is outside the circle");
        }
    }
}
