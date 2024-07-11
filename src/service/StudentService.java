package service;

import model.Student;
import java.util.Scanner;

public class StudentService {
    public Student create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter surname: ");
        String surname = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter gender: ");
        char gender = scanner.next().charAt(0);
        System.out.print("Enter mark: ");
        double mark = scanner.nextDouble();
        System.out.print("Enter isPHD: ");
        boolean isPHD = scanner.nextBoolean();

        return new Student(name, surname, age, gender, mark, isPHD);
    }

    public int StudentAge2024(String name, Student[] students) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return 2024 - student.getYear();
            }
        }
        return -1;
    }

    public Student youngestMaleStudentPHD(Student[] students) {
        Student youngestMalePHD = null;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'm' || students[i].getGender() == 'M') {

                if (students[i].isPHD()) {

                    if (youngestMalePHD == null) {
                        youngestMalePHD = students[i];
                    } else {
                        if (students[i].getYear() > youngestMalePHD.getYear()) {
                            youngestMalePHD = students[i];
                        }
                    }

                }

            }
        }

        return youngestMalePHD;
    }

    public void printAllStudentsPHD(Student[] students) {
        for (Student student : students) {
            if (student.isPHD()) {
                student.printInfo();
                System.out.println("**********************************");
            }
        }
    }

    public void printYoungestMaleInfo(Student[] students) {
        Student youngestMaleStudent = null;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'm' || students[i].getGender() == 'M') {

                if (youngestMaleStudent == null) {
                    youngestMaleStudent = students[i];
                } else {
                    if (students[i].getYear() > youngestMaleStudent.getYear()) {
                        youngestMaleStudent = students[i];
                    }
                }

            }
        }

        if (youngestMaleStudent == null) {
            System.out.println("No male student is found.");
        } else {
            youngestMaleStudent.printInfo();
        }

    }

}










