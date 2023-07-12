package oop.inhr;

public class Main {
    public static void main(String[] args) {
        CompanyPerson companyPerson = new CompanyPerson();
        companyPerson.name = "ali";

        Employee employee = new Employee();
        System.out.println(employee.name);
        employee.name = "sami";


        Admin admin = new Admin();
        System.out.println(admin.name);

    }
}
