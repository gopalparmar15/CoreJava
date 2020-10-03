package co.prominentpixel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentName {
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
        Map<String, List<String>> studentListMap = new LinkedHashMap<>();

        for (Student student : document) {
            if (studentListMap.containsKey(student.getCollege())) {
                List<String> names = studentListMap.get(student.getCollege());
                names.add(student.getName());
            }
            else {
                List<String> studentNames = new ArrayList<>();
                studentNames.add(student.getName());
                studentListMap.put(student.getCollege(), studentNames);
            }
        }
        System.out.println(studentListMap);
    }
    }

