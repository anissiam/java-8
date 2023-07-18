package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentControlPanel studentControlPanel = new StudentControlPanel();
        studentControlPanel.addStaticArray(addDefultData());

        int c;
        do {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("1-Add Student\n2-Show Student\n3-Show All Student\n4-Update Student\n" + "5-Delete Student\n6-Order Student by mark\n7-Get all Success student");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    studentControlPanel.addStudent();

                    break;
                case 2:
                    studentControlPanel.showStudent();
                    break;
                case 3:
                    studentControlPanel.printAllStudent();
                    break;
                case 4:
                    studentControlPanel.updateStudent();
                    break;
                case 5:
                    studentControlPanel.deleteStudent();

                    break;
                case 6:

                    studentControlPanel.order();

                    break;
                case 7:
                    studentControlPanel.getAllSuccess();
                    break;


            }
        } while (c < 8);
    }
    private static ArrayList<Student> addDefultData(){
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student0 = new Student(0,  "Sami" ,(byte) 20 , 'M',  (byte) 77 , "IT");
        arrayList.add(student0);

        Student student1 = new Student(1,"Ali" ,(byte) 25 , 'M',  (byte) 30 , "CS");
        arrayList.add(student1);
        Student student2 = new Student(2,"Sara" ,(byte) 18 , 'f',  (byte) 20 , "AI");
        arrayList.add(student2);
        Student student3 = new Student(3,"Marwa" ,(byte) 26 , 'f',  (byte) 88 , "IT");
        arrayList.add(student3);
        return arrayList;
    }
}

