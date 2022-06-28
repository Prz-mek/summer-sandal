package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class DataMock {

    List<Employee> data = new ArrayList<>();

    public Employee get(int id) {
        return data.get(id);
    }

    public void add(Employee employee) {
        data.add(employee);
    }

    public List<Employee> getAll() {
        List<Employee> copy = new ArrayList<>();
        copy.addAll(data);
        return copy;
    }
}
