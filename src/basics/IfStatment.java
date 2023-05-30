package basics;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plz enter month");
        int month = input.nextInt();
         if (month<=0 || month >12){
             System.out.println("not valid");
             return;
         }

        if (month==1){
            System.out.println("Jan");
        } else if (month==2) {
            System.out.println("Feb");
        } else if (month==3) {
            System.out.println("march");
        } else if (month==4) {
            System.out.println("april");
        } else if (month==5) {
            System.out.println("may");
        } else if (month==6) {
            System.out.println("jun");
        } else if (month==7) {
            System.out.println("july");
        } else if (month==8) {
            System.out.println("aug");
        } else if (month==9) {
            System.out.println("sep");
        }else if (month==10) {
            System.out.println("oct");
        } else if (month==11) {
            System.out.println("nov");
        } else {
            System.out.println("dec");
        }




       /* System.out.println("plz enter mark");
        int mark = input.nextInt();
        if (mark>100 || mark<0){
            System.out.println("Not valid");
            return;
        }

        if (mark>=90){
            if (mark>95){
                System.out.println("Nerd");
            }else {
                System.out.println("Perfect");
            }
        }else if(mark>=80){
            System.out.println("Vary good");
        }else if(mark>=70){
            System.out.println("Good");
        } else if (mark>=60) {
            System.out.println("Pass");
        } else {
            System.out.println("failed");
        }*/

        /*System.out.println("plz enter the text");

        String text = input.nextLine();
        if (text.length()!=0){

        }
            // T    and  F   --> F
        if(!text.isEmpty() && text.length()>=10){
            System.out.println("valid");
        }else {
            System.out.println("not valid");
        }
*/

        /*System.out.println("Plz enter number ");

        int num = input.nextInt();

        if (num>0){
            if(num%2==0){
                System.out.println("even");
            }else {
                System.out.println("Odd");
            }
        }else {
            System.out.println("less than zero");
        }
*/

        /*System.out.println("plz enter the text");

        String text = input.nextLine();
        if (text.isEmpty()){
            System.out.println("empty");
            return;
        }

        if(text.length()>=10){
            System.out.println("valid");
        }else {
            System.out.println("not valid");
        }*/

        /*System.out.println("plz enter the mark");
        byte mark = input.nextByte();

        if (mark==0){
            System.out.println("not valid");
            return;
        }

        if (mark>90){
            System.out.println("perfect");
        }else {
            System.out.println("good");
        }*/


        /*System.out.println("plz enter the number");
        int num = input.nextInt();

        if(num>=0){
            System.out.println("The num is up to zero or equal");
        }else {
            System.out.println("the num is less than zero");
        }*/




        System.out.println("Done");

    }
}
