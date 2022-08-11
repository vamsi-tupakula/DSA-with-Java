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
        student2.changeName("Downey");
        System.out.println(student2.name);

        Student student2_copy = new Student(student2);
        System.out.println(student2_copy.roll_no);

        // final keyword
        final int num = 5;
        // uncommenting below line will give us error. classes, variables, methods defined with final keyword cannot be changed in future.
        // num = 10;
        System.out.println(num);

        final int[] arr = {1, 2, 3, 4, 5};
        arr[0] = 0;
    }
}

class Student {
    String name;
    int roll_no;

    Student() {
        this.name = "guest-user";
        this.roll_no = 1234;
    }

    Student(int roll_no) {
        // calling another constructor from one constructor
        this ("Default User",roll_no);
    }

    Student(Student other) {
        this.name = other.name;
        this.roll_no = other.roll_no;
    }

    Student(String name,int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void changeName(String new_name) {
        this.name = new_name;
    }

    void greet() {
        System.out.println("Hello, My name is " + this.name);
    }
}