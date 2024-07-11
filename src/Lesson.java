import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {

        boolean isActive = true;
        Student[] students = new Student[10];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        while(isActive) {
            System.out.println("****************** manu ***************");
            System.out.println("1: Enter a new student"); // 8 points
            System.out.println("2: receiving the student's name gives his age in 2024"); //8 points
            System.out.println("3: find a male and youngest student with a PHD "); //8 points
            System.out.println("4: Print all PHD Students"); //8 points
            System.out.println("5: Print youngest male info"); //8 points
            System.out.println("6: Exit");
            System.out.println("********************************************");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if(index < students.length) {
                        Student newStudent = service.create();
                        students[index++] = newStudent;
                    }
                    else {
                        System.out.println("The students array is full.");
                    }
                    break;
                case 2:
                    Student[] array2 = new Student[index];
                    for(int i = 0; i < array2.length; i++) {
                        array2[i] = students[i];
                    }
                    System.out.print("name to be searched: ");
                    String searchedName = scanner.next();
                    int searchedNameAge = service.StudentAge2024(searchedName, array2);
                    System.out.println("Student's age is " + searchedNameAge);
                    break;
                case 3:
                    Student[] array3 = new Student[index];
                    for(int i = 0; i < array3.length; i++) {
                        array3[i] = students[i];
                    }
                    Student youngestMalePHD = service.youngestMaleStudentPHD(array3);
                    if(youngestMalePHD != null) {
                        youngestMalePHD.printInfo();
                    }
                    else {
                        System.out.println("No male PHD is found.");
                    }
                    break;
                case 4:
                    Student[] array4 = new Student[index];
                    for(int i = 0; i < array4.length; i++) {
                        array4[i] = students[i];
                    }
                    service.printAllStudentsPHD(array4);
                    break;
                case 5:
                    Student[] array5 = new Student[index];
                    for(int i = 0; i < array5.length; i++) {
                        array5[i] = students[i];
                    }
                    service.printYoungestMaleInfo(array5);
                    break;
                case 6: isActive = false;
            }
        }

    }
}
