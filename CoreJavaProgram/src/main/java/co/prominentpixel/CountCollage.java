package co.prominentpixel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCollage {
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

        Map<String, Integer> map = new HashMap<>();
            for (Student student : document) {
                if (map.containsKey(student.getCollege())) {
                    int num = map.get(student.getCollege());
                    map.replace(student.getCollege(), ++num);
                } else {
                    map.put(student.getCollege(), 1);
                }

            }
        System.out.println(map);
        }
    }

