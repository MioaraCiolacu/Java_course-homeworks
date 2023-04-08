package com.itfactory.map;

import java.util.Objects;

public class Department {
    String nameDepartment;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(nameDepartment, that.nameDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDepartment);
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +
                '}';
    }
}
