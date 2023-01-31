package com.sarac.EmployeeTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> reedAll() {

        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com",
                        Arrays.asList("4122028765", "89987663425")),
                new Employee(100, "Ozzy", "ozy@cydeo.com",
                        Arrays.asList("2022028765", "70387663425")),
                new Employee(100, "Peter", "peter@cydeo.com",
                        Arrays.asList("5162028765", "41987663425"))

        );
    }
}
