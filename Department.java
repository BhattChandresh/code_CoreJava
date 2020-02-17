package com.practice.serde;

import java.io.Serializable;

public class Department implements Serializable {
    protected String departmentName;
    protected String managerName;

    public Department(String departmentName, String managerName) {
        this.departmentName = departmentName;
        this.managerName = managerName;
    }
}
