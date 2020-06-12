package org.example;

public class Collage {
    Student student;

    Collage() {
        System.out.println("College is created");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    void print() {
        System.out.println("hello College Staff");
    }

    void display() {
        print();
        student.print();
    }
}
