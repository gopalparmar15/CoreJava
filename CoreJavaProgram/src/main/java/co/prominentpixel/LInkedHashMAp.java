package com.prominentpixel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LInkedHashMAp {
    public static void main(String[] args) {
        Student s1=new Student(1,"gopal","gardi","First Class");
        Student s2=new Student(2,"abhay","gardi","Second Class");
        Student s3=new Student(3,"jayal","atmiya","Second Class");
        Student s4=new Student(4,"nilesh","atmiya","First Class");
        Student s5=new Student(5,"prashant","atmiya","First Class");
        Student s6=new Student(6,"vishal k","marwadi","Second Class");


        Map<String,Student> map=new LinkedHashMap<>();
        map.put(s1.getName(),s1);
        map.put(s2.getName(),s2);
        map.put(s3.getName(),s3);
        map.put(s4.getName(),s4);
        map.put(s5.getName(),s5);
        map.put(s6.getName(),s6);
        System.out.println(map);

    }
}
