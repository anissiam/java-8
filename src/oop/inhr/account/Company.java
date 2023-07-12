package oop.inhr.account;

public class Company extends Account{
    private int empNo;

    public Company() {
    }

    public Company(int empNo) {
        this.empNo = empNo;
    }

    public Company(String name, int no, String curr, double amount, int empNo) {
        super(name, no, curr, amount);
        this.empNo = empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    @Override
    public void printTypedId() {
        System.out.println("65 " + getNo());
    }

    @Override
    public String toString() {
        return super.toString() +
                " , Company{" +
                "empNo=" + empNo +
                '}';
    }
}
