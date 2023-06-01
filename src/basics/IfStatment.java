package basics;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ + y;
        System.out.println(z);

        z = --y + x++;
        System.out.println(z);

        z = ++x * --y;
        System.out.println(z);

        z = ++x + x;
        System.out.println(z);

        Scanner input = new Scanner(System.in);
        int s = input.nextInt();

        if (s==0){
            System.out.println("==0");
        } else if (s<0) {
            System.out.println("<0");
        } else {
            System.out.println(">0");
        }

        /*int x = 3;

        String result = (x%2!=0)?"odd":"even";
        System.out.println(result);

        if (x%2!=0){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }*/

        /*if (x > 0)
            System.out.println("x is greater than 0");
         else {
            System.out.println("x is less than or equal 0");
        }*/

        /*System.out.println("plz enter santance");
        String ss = input.nextLine();

        if (ss.contains("@")){
            System.out.println("Email");
        }else if(ss.contains(":")){
            System.out.println("url");
        }else {
            System.out.println("normal text");
        }
*/
        /*System.out.println("plz enter x");
        int x = input.nextInt();

        System.out.println("plz enter y");
        int y = input.nextInt();

       System.out.println("1)Add\n2)Sub\n3)div\n4)exit");

        int choice = input.nextInt();
        switch (choice){
            case 1 :
                System.out.println(x+y);
                break;
            case 2 :
                System.out.println(x-y);
                break;
            case 3 :
                if (y==0){
                    System.out.println("can't dived by zero");
                }else {
                    System.out.println(x/y);
                }
                break;
            case 4: System.exit(0);
            default:
                System.out.println("not option");
        }
*/


        /*System.out.println("Plz enter you name");
        String name = input.nextLine();

        char x = name.charAt(0);
        switch (x){
            case 'a','A' : System.out.println("you name start with a");
            break;
            case 'b','B' : System.out.println("you name start with b");
                break;
            case 'c','C' : System.out.println("you name start with c");
                break;
            default:System.out.println("wrong!!");
        }*/

       /* System.out.println("plz enter num");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
                System.out.println("2 Or 3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("wrong!!");break;
        }*/

        /*if (num == 1) {
            System.out.println("1");
        } else if (num == 2 || num == 3) {
            System.out.println("2 or 3");
        } else if (num == 4) {
            System.out.println("4");
        } else {
            System.out.println("wrong!!");
        }
*/


        /*
        System.out.println("plz enter month");
        String month = input.nextLine();

        if (month.equals("jan")){
            System.out.println("1");
        } else if (month.equals("feb")) {
            System.out.println("2");
        } else {
            System.out.println("not valid");
        }*/


        /*switch (month) {
            case "jan":
                System.out.println("1");
                break;
            case "feb":
                System.out.println("2");
                break;
            default:System.out.println("not valid");
            break;
        }*/




        /*int month = input.nextInt();
        if (month <= 0 || month > 12) {
            System.out.println("not valid");
            return;
        }

        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Augs");
                break;
            case 9:
                System.out.println("Spe");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        }*/




        /*if (month==1){
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
        }*/




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
