package org.example.domain;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String firstName;
    private String lastName;
    private Long salary;

    public Employee(String firstName, String lastName, Long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public static Employee fromQuery(String query) {
        if(query == null || query == "") {
            return null;
        }
        Map<String, String> map = new HashMap<>();
        for (String param : query.split("&")) {
            String[] entry = param.split("=");
            if (entry.length > 1) {
                map.put(entry[0], entry[1]);
            }else{
                map.put(entry[0], "");
            }
        }

        return new Employee(map.get("firstName"), map.get("lastName"), Long.parseLong(map.get("salary")));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "'firstName': '" + firstName + '\'' +
                ", 'lastName': '" + lastName + '\'' +
                ", 'salary': " + salary +
                '}';
    }
}
