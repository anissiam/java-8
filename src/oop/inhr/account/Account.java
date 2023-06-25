package oop.inhr.account;

public class Account {
    private String name;
    private int no;
    private String curr;
    private double amount;

    public Account() {
    }

    public Account(String name, int no, String curr, double amount) {
        this.name = name;
        this.no = no;
        this.curr = curr;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void printTypedId(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", curr='" + curr + '\'' +
                ", amount=" + amount +
                '}';
    }
}
