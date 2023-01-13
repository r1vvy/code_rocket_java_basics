package lesson2.task1And2;

public class StudentService {

    public void printStudentDetails(Student student)
    {
        System.out.printf("Name: %s \n" +
                        "Roll number: %d \n" +
                        "Phone number: %s \n" +
                        "Address: %s \n",
                student.getName(),
                student.getRollNumber(),
                student.getPhoneNumber(),
                student.getAddress()
        );
    }
}
