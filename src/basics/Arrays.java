package basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
