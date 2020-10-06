package com.prominentpixel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudentNames {
    public static void main(String[] args) {
        Student s1=new Student(1,"gopal","gardi","First Class");
        Student s2=new Student(2,"abhay","gardi","Second Class");
        Student s3=new Student(3,"gopal","atmiya","Second Class");
        Student s4=new Student(4,"nilesh","atmiya","First Class");
        Student s5=new Student(5,"vishal k","marwadi","Second Class");
        List<Student> document=new ArrayList<>();
        document.add(s1);
        document.add(s2);
        document.add(s3);
        document.add(s4);
        document.add(s5);
        Map<String, List<String>> studentName = new LinkedHashMap<>();

        for (Student student : document) {
            if (studentName.containsKey(student.getCollege())) {
                List<String> names = studentName.get(student.getCollege());
                names.add(student.getName());
            }
            else {
                List<String> studentNames = new ArrayList<>();
                studentNames.add(student.getName());
                studentName.put(student.getCollege(), studentNames);
            }
        }
        System.out.println(studentName);
    }
}
