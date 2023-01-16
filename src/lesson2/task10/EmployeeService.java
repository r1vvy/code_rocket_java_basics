package lesson2.task10;

import java.math.BigDecimal;

public class EmployeeService {

    public void printEmployeeInformation(Employee employee) {
        System.out.println(employee.getName() + " "
                + employee.getYearOfJoining() + " "
                + employee.getAddress()
        );
    }
    /*
        1 - 'getInfo()' which takes the salary, number of hours of work per
    day of employee as parameter
        2 - 'addSalary()' which adds $10 to salary of the employee if it is
    less than $500.
        3 - 'addWork()' which adds $5 to salary of employee if the number
    of hours of work per day is more than 6 hours.
     */
    public void getInfo(Employee employee) {
        System.out.printf(
                "Salary: " + employee.getSalary() + "\n" +
                "Number of hours of work per day: " + employee.getWorkHours() + "\n"
        );
    }
    public Employee addSalary(Employee employee) throws Exception {
        if(employee.getSalary().compareTo(new BigDecimal("500")) < 0)
        {
            BigDecimal newSalary = employee.getSalary().add(new BigDecimal("5"));
            Employee tempEmployee = new Employee(
                    employee.getName(),
                    employee.getYearOfJoining(),
                    newSalary,
                    employee.getWorkHours(),
                    employee.getAddress()
            );
            return tempEmployee;
        } else
            throw new Exception("Employee's salary is higher or equal to 500");
    }
    public Employee addWork(Employee employee) throws Exception
    {
        if(employee.getWorkHours() > 6)
        {
            BigDecimal newSalary = employee.getSalary().add(new BigDecimal("5"));
            Employee tempEmployee = new Employee(
                    employee.getName(),
                    employee.getYearOfJoining(),
                    newSalary,
                    employee.getWorkHours(),
                    employee.getAddress()
            );
            return tempEmployee;
        } else
            throw new Exception("Employee's daily work hours are lower or equal to 6");
    }
}
