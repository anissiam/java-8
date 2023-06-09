package oop.project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Student[] studentsArr = new Student[10];
        ProjectMethods projectMethods = new ProjectMethods(studentsArr);

        //System.out.println(ProjectMethods.arraySize);
        int c ;
        do {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("1-Add Student\n2-Show Student\n3-Show All Student\n4-Update Student\n" +
                    "5-Delete Student\n6-Order Student by mark\n7-Get all Success student");
            c = scanner.nextInt();
            switch (c){
                case 1 :
                    projectMethods.addStudent();
                    break;
                case 2 :
                    if (projectMethods.getStudent()!=null){
                        System.out.println(projectMethods.getStudent().toString());
                    }else {
                        System.out.println("Not found");
                    }
                    break;
                case 3 :
                    ProjectMethods.getAllStudent();
                    break;
                case 4 :
                    projectMethods.updateStudent();
                    break;
                case 5 :
                    projectMethods.deleteStudent();
                    break;
                case  6 :
                    Arrays.sort(ProjectMethods.getArray(), new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if (o1!=null && o2!=null){
                                int s = Integer.compare(o1.getMark(), o2.getMark());
                                return s;

                            }else {
                                return  0;
                            }
                        }
                    });

                    break;
                case 7:
                        projectMethods.getSuccess();
                        break;


            }
        } while (c < 8);
    }

    /*private static void showStudent() {
        System.out.println("Plz Enter Student Id");
        int id = scanner.nextInt();

        for (Student student:studentsArr) {
            if (student!=null){
                if (student.getId()==id){
                    System.out.println(student.toString());
                    return;
                }
            }
        }
        System.out.println("Not found");

    }

    private static void addStudent() {
        Student studentObj = new Student();
        System.out.println("Plz Enter Student Id");
        int id = scanner.nextInt();
        studentObj.setId(id);

        for (Student student:studentsArr) {
            if (student!=null){
                if (student.getId()==id){
                    System.out.println("Plz Enter new Std Id");
                    id = scanner.nextInt();
                    studentObj.setId(id);
                }
            }
        }
        scanner.nextLine();
        System.out.println("Plz Enter Student Name");
        String name = scanner.nextLine();
        studentObj.setName(name);

        System.out.println("Plz Enter Student age");
        byte age = scanner.nextByte();
        studentObj.setAge(age);

        System.out.println("Plz Enter Student gander");
        boolean gender = scanner.nextBoolean();
        studentObj.setGender(gender);

        System.out.println("Plz Enter Student mark");
        byte mark = scanner.nextByte();
        studentObj.setMark(mark);

        String[] majors = {"IT", "CS", "AI", "ENG."};
        for (int i = 0; i < majors.length; i++) {
            System.out.print("[" + (i+1) + "]" + majors[i]+ "  ");
        }
        System.out.println("Select Major");
        int i = scanner.nextInt();
        String major = majors[i-1];
        studentObj.setMajor(major);

        studentsArr[id] = studentObj;

        System.out.println(" Student Added ");
    }*/

}
