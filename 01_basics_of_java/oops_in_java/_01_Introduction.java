package oops_in_java;

public class _01_Introduction {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Java";
        student1.roll_no = 1201;
        System.out.println(student1.name);
        System.out.println(student1.roll_no);
    }
}

class Student {
    String name;
    int roll_no;
}