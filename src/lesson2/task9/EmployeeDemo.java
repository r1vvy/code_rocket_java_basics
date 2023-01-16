package lesson2.task9;

import java.math.BigDecimal;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee employeeOne = new Employee(
                "Robert",
                1994,
                new BigDecimal("1000"),
                "64C - WallStreet"
        );
        Employee employeeTwo = new Employee(
                "Sam",
                2000,
                new BigDecimal("1000"),
                "68D - WallStreet"
        );
        Employee employeeThree = new Employee(
                "John",
                1999,
                new BigDecimal("1000"),
                "26B - WallStreet"
        );

        employeeService.printEmployeeInformation(employeeOne);
        employeeService.printEmployeeInformation(employeeTwo);
        employeeService.printEmployeeInformation(employeeThree);
    }
}
