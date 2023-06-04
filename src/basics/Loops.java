package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
        System.out.println("Min is " + min);

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
