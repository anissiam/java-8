package oop.inhr.account;

public class Personal extends Account {
    private String gender;

    public Personal() {

    }

    public Personal(String gender) {
        this.gender = gender;
    }

    public Personal(String name, int no, String curr, double amount, String gender) {
        super(name, no, curr, amount);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void printTypedId() {
        System.out.println("90 " + getNo());

    }

    @Override
    public String toString() {
        return super.toString() +
                " , Personal{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
