package lesson2.task10;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final int yearOfJoining;
    private final BigDecimal salary;
    private final int workHours;
    private final String address;

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public int getWorkHours() {
        return workHours;
    }

    public Employee(String name, int yearOfJoining, BigDecimal salary, int workHours, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.workHours = workHours;
        this.address = address;
    }
}
