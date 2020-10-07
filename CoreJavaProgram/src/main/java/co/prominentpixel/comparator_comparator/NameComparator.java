package com.prominentpixel.comparator_comparator;

import com.prominentpixel.Student;

import java.util.Comparator;

public class NameComparator  implements Comparator<com.prominentpixel.Student> {

    @Override
    public int compare(com.prominentpixel.Student student, com.prominentpixel.Student student1) {

        com.prominentpixel.Student std=(com.prominentpixel.Student)student;
        com.prominentpixel.Student std1=(Student)student1;
        if (std.getName()==std1.getName())
        {
            return std.getCollage().compareTo(std1.getCollage());
        }
        else
        {
            return std.getName().compareTo(std1.getName());
        }

    }
}
