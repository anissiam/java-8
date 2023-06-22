package oop.inhr;

public class Employee extends CompanyPerson{
    int age;
    void printEmployee(){
        System.out.println(name  + " " + yearOfJoining  +" " + salary + " "+ age);
    }
}
