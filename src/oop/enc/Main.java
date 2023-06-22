package oop.enc;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("anis", "emddsfd", 1111, 2200.0);
        account.setName("sami");
        System.out.println(account.changeToDoller());
        System.out.println(account.getName().toLowerCase());


        /*MyCar myCar = new MyCar();
        myCar.setName("Ford");
        System.out.println(myCar.getName());

        myCar.setSalary(2000);
        int priceWithTax = myCar.getSalary() + 100;
        System.out.println(priceWithTax);*/

    }
}
