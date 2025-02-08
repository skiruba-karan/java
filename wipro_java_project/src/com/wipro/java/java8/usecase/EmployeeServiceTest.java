package com.wipro.java.java8.usecase;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeServiceTest {
    
    private EmployeeService employeeService;
    
    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        employeeService.addEmployee(new Employee(1, "John Doe", "IT", 50000, LocalDate.of(2020, 1, 10)));
        employeeService.addEmployee(new Employee(2, "Jane Doe", "HR", 45000, LocalDate.of(2019, 3, 15)));
    }
    
    @Test
    void testAddEmployee() {
        Employee emp = new Employee(3, "Alice Smith", "Finance", 55000, LocalDate.of(2021, 5, 20));
        employeeService.addEmployee(emp);
        Optional<Employee> found = employeeService.searchEmployee(3);
        assertTrue(found.isPresent());
        assertEquals("Alice Smith", found.get().getName());
    }
    
    @Test
    void testRemoveEmployee() {
        employeeService.removeEmployee(1);
        Optional<Employee> found = employeeService.searchEmployee(1);
        assertFalse(found.isPresent());
    }
    
    @Test
    void testSearchEmployee() {
        Optional<Employee> found = employeeService.searchEmployee(2);
        assertTrue(found.isPresent());
        assertEquals("Jane Doe", found.get().getName());
    }
    
    @Test
    void testUpdateSalary() {
        employeeService.updateSalary(1, 60000);
        Optional<Employee> found = employeeService.searchEmployee(1);
        assertTrue(found.isPresent());
        assertEquals(60000, found.get().getSalary());
    }
    
    @Test
    void testFilterByDepartment() {
        List<Employee> itEmployees = employeeService.filterByDepartment("IT");
        assertEquals(1, itEmployees.size());
        assertEquals("John Doe", itEmployees.get(0).getName());
    }
    
    @Test
    void testSortByName() {
        List<Employee> sorted = employeeService.sortByName();
        assertEquals("Jane Doe", sorted.get(0).getName());
        assertEquals("John Doe", sorted.get(1).getName());
    }
    
    @Test
    void testGetAverageSalary() {
        double avgSalary = employeeService.getAverageSalary();
        assertEquals(47500, avgSalary);
    }
}
