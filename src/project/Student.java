package project;

public class Student  extends Person {
    private  int id ;
    private byte mark;
    private String major;
    public Student() {

    }

    public Student(int id, byte mark, String major) {
        this.id = id;
        this.mark = mark;
        this.major = major;
    }

    public Student(int id, String name, byte age, char gender,  byte mark, String major) {
        super(name, age, gender);
        this.id = id;
        this.mark = mark;
        this.major = major;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public byte getMark() {
        return mark;
    }

    public void setMark(byte mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    String printTextGender() {
        if (getGender()=='M' || getGender()=='m'){
            return "Male";
        }
        else {
            return "Female";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", mark=" + mark +
                ", major='" + major + '\'' +
                '}' + super.toString();
    }

}
