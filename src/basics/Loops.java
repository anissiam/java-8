package basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              System.out.print("*");
            }
            System.out.println();
        }*/
     /*   System.out.println("***");
        System.out.println("***");
        System.out.println("***");*/
        /*System.out.println("Plz enter name ");
        String name = scanner.nextLine();

        for (;;){
            if (name.equalsIgnoreCase("Anis")){
                System.out.println("Plz enter " + name + " age ");
                int age = scanner.nextInt();
                System.out.println(name + " is " + age);
                break;
            }
            System.out.println("Plz enter new name ");
            name = scanner.nextLine();
        }*/

        /*int num;
        int max = 0;
        int min = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Plz enter num");
            num = scanner.nextInt();
            if (i==0){
                max = num;
                min = num;
            }

            if (max<num){
                max = num;
            }
            if (min >num){
                min = num;
            }
        }

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);*/
        /*for (int i = 0; i <= 100; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
*/
        /*int sum = 0;
        int i = 0;
        for (; i < 5; i++) {
            System.out.println("plz enter n" + (i + 1));
            int x = scanner.nextInt();
            sum += x;
        }
        System.out.println("ava = " + sum/i);
*/

        /*System.out.println("plz enter num");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = n ; i >1 ; i--) {
            fact *= i;
        }
        System.out.println(fact);
*/
        /*int sum = 0;

        for(int i =0; i<=100;i++){
            //System.out.println(i);
            sum += i;
        }
        System.out.println("Sum is " + sum);*/


        /*for(int i = 0 ; i<=4;i++){
            System.out.println("Hello");
        }*/

        /*for(;;){
            System.out.println("Hello");
        }*/

        /*while (true){
            System.out.println("hello");
        }*/
        /*int i = 0; // init value



        while (i<=4){
            System.out.println("Hello");
            i++;
        }*/


        /*int i = 5;

        do {
            System.out.println("Hello");
        }while (i<5);*/


        /*while (i<5){
            System.out.println("Hello");
        }*/


        /*Scanner input = new Scanner(System.in);

        int i = 1;
        int max = 0;
        int min = 0;
        int num;
        while (i <= 3) {
            System.out.println("plz enter num " + i);
            num = input.nextInt();

            if (i == 1) {
                max = num;
                min = num;
            }

            if (max < num) {
                max = num;
            }

            if (min > num) {
                min = num;
            }
            i++;

        } System.out.println("Max is " + max);
        System.out.println("Min is " + min);*/

       /* System.out.println("plz enter the letter");
        String text = input.nextLine();*/


        /*String text ;
        while (true){
            System.out.println("plz enter the  letter");
            text = input.nextLine();
            if (text.equalsIgnoreCase("stop")){
                System.out.println("i found Stop");
                continue;
            }

        }*/



       /* int i = input.nextInt();

        while (true){
            if(i==0){
                System.out.println("you enter zero");
                break;
            }
            i = input.nextInt();
        }*/
        /*while (i!=0){
            System.out.println("Enter next num ");
            i = input.nextInt();
        }*/


        /*System.out.println("plz enter num");
        int i = input.nextInt();
        double fact = 1;
        while (i>=1){
            fact *=i;
            i--;
        }
        System.out.println("the fact is " + fact);*/






        /*int fact = 1;
        int i = 7;
        while (i>=1){
            fact *= i;
            i--;
        }

        System.out.println(fact);*/


        /*int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum = sum + i;// sum+=i
            i++;
        }
        System.out.println(sum);*/




       /* System.out.println("Hello"); //i=0
        System.out.println("Hello"); //i=1
        System.out.println("Hello"); //i=2
        System.out.println("Hello"); //i=3
        System.out.println("Hello"); //i=4*/

       /* int i = 0; // init value
        while (i <= 100) {
            System.out.println(i);
            i+=2;
        }*/


        /*int i = 0; // init value

        while (i<=4){
            System.out.println("Hello");
            i++;
        }*/


    }
}
