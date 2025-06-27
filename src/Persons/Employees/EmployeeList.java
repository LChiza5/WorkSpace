/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;
import java.util.Arrays;

/**
 *
 * @author ccore
 */
public class EmployeeList implements List<Employee> {
    private final Employee employees[];

    public EmployeeList() {
        this.employees = new Employee[100];
        
    }

    @Override
    public boolean add(Employee Employee) {
        if (Employee == null) {
        return false;
    }
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] == null) {
            employees[i] = Employee;
            return true;
        }
    }
    return false;
    }

    @Override
    public boolean remove(Employee Employee) {
        if (Employee == null) return false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(Employee)) {
                for (int j = i; j < employees.length - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[employees.length - 1] = null; 
                return true;
            }
        }
        return false; 
    }

    @Override
    public Employee find(Object Employee) {
        if (Employee == null) return null;

        for (Employee employee : employees) {
            if (employee != null && employee.equals(Employee)) {
                return employee;
            }
        }

        return null;
    }

    @Override
    public void showAll() {
       System.out.println(Arrays.toString(employees));
    }
    
    
}
