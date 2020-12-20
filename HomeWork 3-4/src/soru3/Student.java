package soru3;

public class Student {

	private String Number;
    private String Name;
    private String lastName;
    private int age;

    public Student(String number, String name, String lastName, int age) {
        Number = number;
        Name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Number='" + Number + '\'' +
                ", Name='" + Name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                "}";
    }
}
