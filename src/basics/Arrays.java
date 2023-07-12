package basics;


import java.util.Collections;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 7, 1 };

        java.util.Arrays.sort(arr);

        for (int t: arr) {
            System.out.print(t + "  ");
        }

       /* int temp = 0;

        for (int t: arr) {
            System.out.print(t + "  ");
        }


        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int t: arr) {
            System.out.print(t + "  ");
        }*/
        /*String month [][] = {{"Sat" , "Sun" ,"Mon" , "Thu" , "Wen" , "Thr", "Fri"},
                {"Sat" , "Sun" ,"Mon" , "Thu" , "Wen" , "Thr", "Fri"},
                {"Sat" , "Sun" ,"Mon" , "Thu" , "Wen" , "Thr", "Fri"},
                {"Sat" , "Sun" ,"Mon" , "Thu" , "Wen" , "Thr", "Fri"}};

        for (int i = 0; i < month.length; i++) {
            System.out.println("Week" + (i + 1));
            for (int j = 0; j < month[i].length; j++) {
               System.out.print(month[i][j] +" ");
            }
            System.out.println();
        }*/

        //int[][] nums = new int[3][4];
        /*int[][] nums = {{5,10,3,2},{8,9,7,4 , 900},{4,8,9,3}};
        System.out.println(nums.length); // num of row
        System.out.println(nums[0].length); // num of elements inside 0 row


        for (int i = 0; i < nums.length; i++) {
            //System.out.println("nums[" + i + "]");
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }*/
        /*String [] names1 = {"Anis" , "Sami" , "Ali" , "SOSO"};
        String [] names2 = {"TOTO" , "Mohamed" ,"Ali" , "Ali" , "Mohed" , "Anis"};
        int count = 0;
        for (int i = 0; i < names2.length; i++) {
            if (names2[i].equalsIgnoreCase("Ali")){
                count++;
            }
        }

        System.out.println(count);*/

        /*for (int i = 0; i < names1.length; i++) {
            for (int j = 0; j < names2.length; j++) {
                if (names1[i].equalsIgnoreCase(names2[j])){
                    System.out.println(names1[i] + " is found");
                }
            }
        }*/


        /*Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int n : nums) {
            System.out.print(n + "  ");
        }
        int multiple = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("plz enter the nums[" + i + "]");
            nums[i] = input.nextInt();
            sum += nums[i];
            multiple *= nums[i];
        }
        System.out.println("The multiple is " + multiple);
        System.out.println("The sum is " + sum);
        for (int n : nums) {
            System.out.print(n + "  ");

        }
*/

        /*int[] nums = {10, 7, 30, 5, 8};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                System.out.println( nums[i] + " Even");
            }else {
                System.out.println( nums[i] + " Odd");
            }
        }*/



        /*
        String [] names = {"anis" , "Sami" , "Ali" , "SOSO"};

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("ali")){
                System.out.println("Found in index " + i);
                System.out.println("Plz enter new Name");
                names[i] = input.nextLine();
                break;
            }
        }

        for (String s:names) {
            System.out.println(s);
        }*/

        //int[] nums = new int[5];
        //int[] nums = {5, 40, 9, 2};
        /*System.out.println(nums[0]);
        System.out.println(nums.length);// طول المصفوفة
        nums[0] = 10;
        System.out.println(nums[0]);
        nums[3] = nums[0];
        System.out.println(nums[3]);
        nums[3] = 500;
        int x = nums[3];
        System.out.println(x);
        System.out.println("=================");*/

        /*for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }*/


        //System.out.println(nums[5]);//ArrayIndexOutOfBoundsException
        //System.out.println(nums[-1]);//ArrayIndexOutOfBoundsException

        // System.out.println(nums); // طباعة العنوان


       /* int n1 = 10;
        int n2 = 30;
        int n3 = 10;
        int n4 = 2;*/

    }
}
