package oop.enc;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.setName("Ford");
        System.out.println(myCar.getName());

        myCar.setSalary(2000);
        int priceWithTax = myCar.getSalary() + 100;
        System.out.println(priceWithTax);

    }
}
