package com.prominentpixel;

import java.util.*;

public class UniqName {
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
        System.out.println(document);
        Map<String,Student> object=new HashMap<>();
       // Map<String,Student> object=new LinkedHashMap<>();

        for (Student student:document)
        {
            object.put(student.getName(),student);
        }
       // System.out.println(object);
        System.out.println(object.keySet());
    }
}
