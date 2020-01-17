package com.sparta.thanu.engineering50.java.example;

import com.sparta.thanu.engineering50.java.EmployeeCollection;
import com.sparta.thanu.engineering50.java.Employees;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EmployeeTest {
    Employees employees;
    EmployeeCollection employeeCollection;
    public HashMap<String, Employees> maping = new HashMap<>();
    @BeforeEach //before ever one
    public void createEmployee() {
        employees = new Employees("3", "Mr.", "Example", "E", "Example", "F", "ee@hotmail", "5/12/1982", "5/06/2002", "19000");

        maping.put(employees.getId(), employees);
    }
    @Test
    void testingObjectIsWorking() {
        assertEquals(maping.get("1"), employees);
    }
    @Test
    void testingIdIsWorkingCorrect() {
        assertEquals("1", employees.getId());
    }

    @Test
    void testingIfItsNotEqual() {
        assertNotEquals(3, employees.getId());
    }
    @Test
    void testingIfIDisNotEqual() {
        assertNotEquals("Mrs.", employees.getTitle());
    }
    @Test
    void testingNamePrefixIsMr() {
        assertEquals("Mr.", employees.getTitle());
    }


    @Test
    void testingLastName() {
        assertEquals("Example", employees.getLastName());
    }
    @Test
    void testingFirstName() {
        assertEquals("Example", employees.getFirstName());
    }
    @Test
    void testingGender() {
        assertEquals('F', employees.getGender());
    }

    @Test
    void testMiddleName() {
        assertEquals('E', employees.getMiddleInitial());
    }




    @Test
    void testingEmail() {
        assertEquals("ee@hotmail", employees.getEmail());
    }
    @Test
    void testingSalary() {
        assertEquals((19000), employees.getSalary());
    }
    @Test
    void testingDateOfBirth() {
        assertEquals(LocalDate.parse("5/12/1982", employees.getDateOfBirth());
    }

    @Test
    void testingStartDate() {
        assertEquals(LocalDate.parse("5/06/2002", employees.getJoinDate());
    }




}
