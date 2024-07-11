package model;

public class Student {
    private String name;
    private String surname;
    private int year;
    private char gender;
    private double mark;
    private boolean isPHD;

    public Student(String name, String surname, int year, char gender, double mark, boolean isPHD) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.gender = gender;
        this.mark = mark;
        this.isPHD = isPHD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isPHD() {
        return isPHD;
    }

    public void setPHD(boolean PHD) {
        isPHD = PHD;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("Mark: " + mark);
        System.out.println("IsPHD: " + isPHD);
    }

}
