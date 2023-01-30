package com.sarac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        //Creating Stream from Array

        String[] courses = {"Java", "Spring", "Agile"};
        Stream<String>courseStream=Arrays.stream(courses);

        //Creating Stream from Collection
        List<String>courseList=Arrays.asList("Java", "Spring", "Agile");
        Stream<String>courseStream2=courseList.stream();

        List<Course>myCourses=Arrays.asList(
                new Course("Java",101),
                new Course("DS",102),
                new Course("MS",103)
        );

        Stream<Course>myCourseStream=myCourses.stream();

    }
}