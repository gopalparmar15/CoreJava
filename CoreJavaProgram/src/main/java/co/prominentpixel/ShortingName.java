package com.prominentpixel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortingName {
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
        //shorting with compareble
        System.out.println("Sorting with name");
        Collections.sort(document);
        for (Student st:document)
        {
            System.out.println(st.getId()+" "+st.getName()+" "+st.getCollege()+" "+st.getGrade());
        }
    }
}
