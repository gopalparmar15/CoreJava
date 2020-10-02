package co.prominentpixel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqName {
    public static void main(String[] args) {

        Student s1=new Student(1,"gopal","gardi","A");
        Student s2=new Student(2,"abhay","gardi","B");
        Student s3=new Student(3,"gopal","atmiya","A");
        Student s4=new Student(4,"nilesh","atmiya","B");
        Student s5=new Student(5,"vishal k","marwadi","C");

        List<Student> document=new ArrayList<>();
        document.add(s1);
        document.add(s2);
        document.add(s3);
        document.add(s4);
        document.add(s5);
        System.out.println(document);



        Map<String,Student> object=new HashMap<>();
        for (Student student:document)
        {
            object.put(student.getName(),student);
        }

        System.out.println(object.keySet());
    }
}
