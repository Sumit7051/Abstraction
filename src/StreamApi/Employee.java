package StreamApi;

import java.util.List;

public class Employee {
        private String name;
        private String Role;
        private int Salary;
//    List<String> names = List.of("Sumit", "Bhanu","Udhav");

    public Employee(String name , String Role,int sal)
    {
        this.name = name;
        this.Role = Role;
        this.Salary = sal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Role='" + Role + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
