package com.sarac.EmployeeTask;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        //Print of emails
        EmployeeData.reedAll().map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print All phone numberss
        System.out.println("Phone numbers");
        EmployeeData.reedAll().flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        System.out.println("Print Phone number with double colomn operator");

        EmployeeData.reedAll().map(Employee::getEmpPhoneNumber)
                .flatMap(List<String>::stream)
                .forEach(System.out::println);
    }
}
