package oop.inhr.account;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal("Ali" , 1000, "USD" ,200.0 , "Male" );
        personal.setName("ANis");
        personal.printTypedId();
        System.out.println(personal.toString());


        Company company = new Company("Vision" , 2000, "ILS" ,10000 , 10);
        company.printTypedId();
        System.out.println(company.toString());
    }
}
