package oops_in_java;

public class _01_Introduction {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Robert",2309);
        // student1.name = "Java";
        // student1.roll_no = 1201;
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1.roll_no);
        System.out.println(student2.roll_no);
        student1.greet();
    }
}

class Student {
    String name;
    int roll_no;

    Student() {
        this.name = "guest-user";
        this.roll_no = 1234;
    }

    Student(String name,int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void greet() {
        System.out.println("Hello, My name is " + this.name);
    }
}