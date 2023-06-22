package oop.enc;

public class Account {

    private String name;
   private String email;
    private int account_no;
    private double amount;

    public Account() {
    }

    public Account(String name, String email, int account_no, double amount) {
        this.name = name;
        this.email = email;
        this.account_no = account_no;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void printData(){
       System.out.println("Name:" + name + " Email:" + email +
               " Account no.:" + account_no + " amount:" + amount);

    }
    public double changeToDoller(){
        double change = amount/3.61;
        return change;
    }
}
