package oop.inhr;

public class Admin extends CompanyPerson{
    String access;

    void printAdmin(){
        System.out.println(name  + " " + yearOfJoining  +" " + salary + " " + access);
    }
}
