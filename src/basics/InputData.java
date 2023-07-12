package basics;


import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // انشاء نسخة من SCNNER

        System.out.println("Plz enter your name");
        String name = input.nextLine();

        System.out.println("Plz enter your last name");
        String lastName = input.nextLine();

        System.out.println("Plz enter your age");
        int age = input.nextByte();

        System.out.println("Plz enter your tall");
        double tall = input.nextDouble();

        String fullName = name.concat(lastName).toUpperCase();
        System.out.println("The full name is " + fullName + "\nAge is " + age +
                "\nand the tall is " + tall);

        //System.out.println(fullName.isEmpty());



        /*System.out.println("Plz enter the number1");
        int x = input.nextInt();

        System.out.println("Plz enter the number2");
        int y = input.nextInt();

        int result = x + y;
        System.out.println("The Sum is " + result);

        boolean test = x >= y;
        System.out.println(test);
        */








    }
}
