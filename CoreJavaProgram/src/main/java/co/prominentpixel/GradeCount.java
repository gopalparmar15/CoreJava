package co.prominentpixel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeCount {
    public static void main(String[] args) {
        Student s1=new Student(1,"gopal","gardi","First Class");
        Student s2=new Student(2,"abhay","gardi","Second Class");
        Student s3=new Student(3,"jayal","atmiya","Second Class");
        Student s4=new Student(4,"nilesh","atmiya","First Class");
        Student s5=new Student(5,"prashant","atmiya","First Class");
        Student s6=new Student(6,"vishal k","marwadi","Second Class");
        List<Student> document=new ArrayList<>();
        document.add(s1);
        document.add(s2);
        document.add(s3);
        document.add(s4);
        document.add(s5);
        document.add(s6);

        Map<String, Map<String, Integer>> map = new HashMap<>();
        int num = 1;
        for (Student student : document) {
            if (map.containsKey(student.getCollege())) {
                Map<String, Integer> grade = map.get(student.getCollege());

                if (grade.containsKey(student.getGrade())) {
                    grade.replace(student.getGrade(), ++num);
                } else {
                    grade.put(student.getGrade(), 1);
                }
            }
            else {
                Map<String, Integer> gradeMap = new HashMap<>();
                if (student.getGrade() == "First Class") {
                    gradeMap.put("First Class", 1);
                } else {
                    gradeMap.put("Second Class", 1);
                }

                map.put(student.getCollege(), gradeMap);
            }
        }
        System.out.println(map);

    }
}
