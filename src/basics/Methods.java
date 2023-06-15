package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = 10;
        int x = 50;

        sum(x, y);
        sub(x, y);

        String[] names1 = {"Ali", "Sami", "Anis"};
        printArray(names1);

    }

    public static void printArray(String[] names) {
        for (int i = 0; i < names.length; i++) {

            showName(names[i]);

        }
    }

    public static void showName(String name) {
        System.out.println(name);
    }

    public static void sum(int x, int y) {

        int result = x + y;
        System.out.println(result);
    }

    public static void sub(int x, int y) {

        int result = x - y;
        System.out.println(result);
    }

}
