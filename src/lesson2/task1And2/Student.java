package lesson2.task1And2;

public class Student {
    private final String name;
    private final String phoneNumber;
    private final String address;
    private final int rollNumber;



    public Student(String name, String phoneNumber, String address, int rollNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}

