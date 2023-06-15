package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)add\n2)sub3)division");

        int c = scanner.nextInt();

        switch (c){
            case 1 :
                int x = getNum();
                int y = getNum();
                sum(x,y);
                break;
            case 2 :
                int x1 = getNum();
                int y1 = getNum();
                sub(x1, y1);
                break;
            case 3:
                System.out.println(div(getNum(), getNum()));
                break;
        }



        /*
        int y = 10;
        int x = 50;

        sum(x, y);
        sub(x, y);

        String[] names1 = {"Ali", "Sami", "Anis"};
        printArray(names1);

        int s = sum1(x, y);
        System.out.println(sum1(x, y));
        System.out.println(s);


        int[] nums = {10, 50, 60, 70};

        System.out.println(sumArray(nums));


        System.out.println(sumArray(nums) / nums.length);*/
    }



    public static int getNum(){
        Scanner scanner = new Scanner(System.in);
        int re = scanner.nextInt();

        return re;
    }
    public static int div(int x , int y){
        int result= 0 ;
        if (y==0){
           System.out.println("can't divide by zero");
        }else {
             result = x / y;
        }
        return result;
    }


    public static int sumArray(int[] nums){
        int sum = 0;
        for (int n:nums) {
            sum += n;
        }
        return sum;
    }
    public static int sum1(int x, int y) {

        int result = x + y;

        return result;
    }

    public static String showName1(String name) {
        System.out.println(name);
        return name;
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
