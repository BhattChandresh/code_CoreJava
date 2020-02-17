package com.practice.serde;

import java.io.Serializable;

public class Emp implements Serializable {
    protected String empName;
    protected double salary;

    public Emp(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }
}
