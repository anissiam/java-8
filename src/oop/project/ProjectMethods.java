package oop.project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProjectMethods {
    Scanner scanner = new Scanner(System.in);
    static Student[]  studentsArr ;
    static int arraySize ;

    static int autoId = 0;
    public ProjectMethods(Student[] studentsArr) {
        this.studentsArr = studentsArr;
        System.out.println("Plz enter room size");
        studentsArr= new Student[scanner.nextInt()];
        arraySize = studentsArr.length;

    }

    public void addStudent(){

        Student studentObj = new Student();
        /*System.out.println("Plz Enter Student Id");
        int id = scanner.nextInt();*/
        studentObj.setId(autoId);

        /*for (Student student:studentsArr) {
            if (student!=null){
                if (student.getId()==id){
                    System.out.println("Plz Enter new Std Id");
                    id = scanner.nextInt();
                    studentObj.setId(id);
                }
            }
        }*/
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

        studentsArr[autoId] = studentObj;

        System.out.println(" Student Added ");

        autoId++;
        System.out.println(autoId + " " + arraySize);

        if (arraySize>autoId){
            addStudent();
        }
    }
    public Student getStudent(){
        System.out.println("Plz Enter Student Id");
        int id = scanner.nextInt();
        for (Student student:studentsArr) {
            if (student!=null){
                if (student.getId()==id){
                    return student;
                }
            }
        }
       return null;
    }

    public static void getAllStudent(){
        for (Student student :studentsArr){
            if (student!=null){
                System.out.println(student.toString());
            }
        }
    }


    public void updateStudent(){
         int id = getId();
        for (Student student:studentsArr) {
            if (student!=null){
                if (student.getId()==id){
                   System.out.println("Plz enter new mark");
                    byte mark = scanner.nextByte();
                    student.setMark(mark);
                    System.out.println("Updated");
                    return;
                }
            }
        }
    }

    public int getId(){
        System.out.println("Plz Enter Student Id");
        return  scanner.nextInt();
    }

    public void deleteStudent() {
        int id= getId();
        studentsArr[id] = null;
        System.out.println("Deleted");
    }
    public static Student[] getArray(){
        return studentsArr;
    }


    public void getSuccess(){
        int count = 0;
        for (int i = 0; i < arraySize; i++) {
            if (studentsArr[i].getMark()>=50){
                count++;
            }
        }

        Arrays.sort(getArray(), new Comparator<Student>() {
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

        Student[] newArray = new Student[count];
        int count1 = 0;
        for (int i = count; i < arraySize; i++) {
            newArray[count1] = studentsArr[i];
            count1++;
        }

        for (Student student :newArray){
            if (student!=null){
                System.out.println(student.toString());
            }
        }
    }
}
