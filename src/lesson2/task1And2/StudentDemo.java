package lesson2.task1And2;

public class StudentDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student studentOne = new Student(
                "John",
                "123123123",
                "Ventspils, Inzenieru iela 101",
                1
        );
        Student studentTwo = new Student(
                "Sam",
                "123123123",
                "Ventspils, Inzenieru iela 101",
                2
        );

        studentService.printStudentDetails(studentOne);
        System.out.println("------------------------");
        studentService.printStudentDetails(studentTwo);
    }
}
