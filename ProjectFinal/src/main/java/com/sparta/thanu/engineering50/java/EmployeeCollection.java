package com.sparta.thanu.engineering50.java;

import java.util.HashMap;

public class EmployeeCollection {
    HashMap<String, Employees> map = new HashMap<>();
    public Employees addEmployee(String emp, Employees employees) {
        map.put(emp,employees);
        System.out.println(map);
        return map.get(1);
}}
