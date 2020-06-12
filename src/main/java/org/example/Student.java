package org.example;

import org.springframework.stereotype.Component;

@Component
public class Student {
    Student() {
        System.out.println("Student is created");
    }

    void print() {
        System.out.println("hello Student");
    }
}
