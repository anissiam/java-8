package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        int marks[] = new int[5];


        int choice = 0;
        do {
            System.out.println();
            System.out.println("1)Show Arrays\n2)Add Names\n3)Add Marks\n4)Sort Mark Array\n5)Update\n6)Delete\n7)Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1)Names\n2)Marks");
                    int c = input.nextInt();
                    switch (c) {
                        case 1:
                            for (String name : names) {
                                System.out.print(name + " ");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < marks.length; i++) {
                                System.out.print(marks[i] + " ");
                            }
                            break;
                    }
                    break;
                case 2:
                    input.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("Plz enter name" + (i+1));
                        names[i] = input.nextLine();
                    }
                    System.out.println("Added");
                    break;
                case 3 :
                    input.nextLine();
                    for (int i = 0; i < marks.length; i++) {
                        System.out.println("Plz enter mark" + (i+1));
                        marks[i] = input.nextInt();
                    }
                    System.out.println("Added");
                    break;
                case 4 :
                    Arrays.sort(marks);
                    System.out.println("Sorted");
                    break;
                case 5 :
                    System.out.println("1)Names\n2)Marks");
                    int c1 = input.nextInt();
                    switch (c1){
                        case 1:
                            input.nextLine();
                            System.out.println("Plz enter the name ");
                            String name = input.nextLine();
                            for (int i = 0; i < names.length; i++) {
                                if (names[i].equalsIgnoreCase(name)){
                                    System.out.println("Plz enter new name");
                                    String newName = input.nextLine();
                                    names[i] = newName;
                                    System.out.println("Updated");
                                }else {
                                    System.out.println("Not found");
                                }
                            }
                            break;

                    }
                    break;
            }

        } while (choice != 7);

    }
}
