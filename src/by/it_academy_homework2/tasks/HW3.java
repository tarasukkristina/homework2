package by.it_academy_homework2.tasks;

import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28800);
        System.out.println(n);
        int hours = n / 3600;
        randomSecHours(hours);
    }

    public static void randomSecHours(int hours) {

        if (hours < 0) {
            System.out.println("Осталось менее часа");
        } else if (hours == 1) {
            System.out.println("Остался " + hours + " час");
        } else if (hours > 1 && hours < 5) {
            System.out.println("Осталось " + hours + " часа");
        } else {
            System.out.println("Осталось " + hours + " часов");
        }
    }
}




