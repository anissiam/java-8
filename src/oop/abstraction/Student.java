package oop.abstraction;

public abstract class Student {
    private String name;
    private int age;
    private double total;

    public Student(String name, int age, double total) {
        this.name = name;
        this.age = age;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", total=" + total +
                '}';
    }

    protected abstract String checkTotal();
    public abstract void checkAge();
}
