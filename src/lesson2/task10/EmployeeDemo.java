package lesson2.task10;


import java.math.BigDecimal;

public class EmployeeDemo {
    public static void main(String[] args) throws Exception {
        EmployeeService employeeService = new EmployeeService();

        Employee employeeOne = new Employee(
                "Robert",
                1994,
                new BigDecimal("1000"),
                7,
                "64C - WallStreet"
        );
        Employee employeeTwo = new Employee(
                "Sam",
                2000,
                new BigDecimal("1000"),
                6,
                "68D - WallStreet"
        );
        Employee employeeThree = new Employee(
                "John",
                1999,
                new BigDecimal("499"),
                6,
                "26B - WallStreet"
        );
        //employeeOne = employeeService.addSalary(employeeOne);
        //employeeTwo = employeeService.addWork(employeeTwo);

        employeeOne = employeeService.addWork(employeeOne);
        employeeThree = employeeService.addSalary(employeeThree);

        employeeService.getInfo(employeeOne);
        employeeService.getInfo(employeeThree);
    }
}
