package oop.interfaces.superman;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Alrmal", "Gaza");
        address.setCity("Rafah");
        Person person = new Person("Anis" ,"male" , 30, address );
        System.out.println(person.getAddress().getCity());


        SuperMan superMan = new SuperMan("Clark", "Male", 180, address);
        superMan.power("FLy");
        System.out.println(superMan.toString());

    }
}
