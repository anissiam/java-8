package project;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentControlPanel {

    private ArrayList<Student> studentArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addStaticArray(ArrayList<Student> list){
        this.studentArrayList.addAll(list);
    }
    public void addStudent(){


        System.out.println("Enter student id from " + studentArrayList.size());
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter student Age:");
        byte age = scanner.nextByte();

        scanner.nextLine();

        System.out.println("Enter student Gender:");
        char gender = scanner.nextLine().charAt(0);

        System.out.println("Enter student mark:");
        byte mark = scanner.nextByte();

        String[] majors = {"IT", "CS", "AI", "ENG."};
        for (int i = 0; i < majors.length; i++) {
            System.out.print("[" + (i+1) + "]" + majors[i]+ "  ");
        }
        System.out.println("Select Major");
        int i = scanner.nextInt();
        String major = majors[i-1];

        Student student = new Student( id,name ,age , gender,  mark , major);

        studentArrayList.add(student);
        System.out.println("Student added");

    }


    public void printAllStudent(){
        for (Student student:studentArrayList) {
            System.out.println(student.toString());
        }
    }

    public void showStudent(){
        System.out.println("Enter student id");
        int id = scanner.nextInt();
        try {
            System.out.println(studentArrayList.get(id).toString());
        }catch (Exception e){
            System.out.println("Student not found");
        }
        /*for (Student s:studentArrayList) {
            if (s.getId()==id){
                System.out.println(s.toString());
            }
        }*/
    }

    public void updateStudent(){
        System.out.println("Enter student id");
        int id = scanner.nextInt();
        try {
            Student student = studentArrayList.get(id);
            System.out.println(student.toString());
            System.out.println("Plz enter new mark");
            byte mark = scanner.nextByte();
            student.setMark(mark);
            System.out.println("Updated");
        }catch (Exception e){
            System.out.println("Student not found");

        }
    }

    public void deleteStudent(){
        System.out.println("Enter student id");
        int id = scanner.nextInt();
        try {
            Student student = studentArrayList.get(id);
            System.out.println(student.toString());
            studentArrayList.remove(student);
            System.out.println("Deleted");
        }catch (Exception e){
            System.out.println("Student not found");
        }
    }

    public void order(){

        studentArrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getMark(), o2.getMark());
            }
        });
        Collections.reverse(studentArrayList);
    }
    public void getAllSuccess(){


        ArrayList<Student> successList = new ArrayList<>();

        for (Student s :studentArrayList) {
            if (s.getMark()>=50){
                successList.add(s);
            }
        }

       // List<Student> successList = studentArrayList.stream().filter(student -> student.getMark() >= 50).toList();


        /*List<Student> successList = studentArrayList.stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getMark() >= 50;
            }
        }).toList();*/
        for (Student student:successList) {
            System.out.println(student.toString());
        }

    }
}
