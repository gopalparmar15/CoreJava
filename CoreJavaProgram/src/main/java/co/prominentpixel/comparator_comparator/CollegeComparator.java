package com.prominentpixel.comparator_comparator;

import com.prominentpixel.Student;

import java.util.Comparator;

public class CollegeComparator implements Comparator<com.prominentpixel.Student> {
    @Override
    public int compare(com.prominentpixel.Student student, Student student1) {

        return student.getCollage().compareTo(student1.getCollage());
    }
}
