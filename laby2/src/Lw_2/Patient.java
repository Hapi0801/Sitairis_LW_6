package Lw_2;

import java.util.Scanner;

public class Patient {

    //data about patients
    private String name;
    private String surname;
    private String gender;
    private int age;

    private static int number;
    static String female = "female";
    private static int sumAge;
    private static int avAge;

    //constructors
    public Patient() {
        this.name = null;
        this.surname = null;
        this.gender = null;
        this.age = 0;
    }

    public Patient(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    //gets methods
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age; }

    //set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //my methods
    public void setAllPatientInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input patient name: ");
        name = in.nextLine();
        System.out.print("Input patient surname: ");
        surname = in.nextLine();
        System.out.print("Input patient gender: ");
        gender = in.nextLine();
        System.out.print("Input patient age: ");
        age = in.nextInt();
    }

    // search woman between patients
    public void numberOfWoman(Patient patient, int check) {
        if (patient.getGender().equals(female)) {number++;}
    }

    //print information about number of woman
    public void printNumber() {
        System.out.println("Number of women: "+number);
    }

    //sum of patients age
    public void sumAge(Patient patient) {
        patient.getAge();
        sumAge+=age;
    }

    //Average age
    public void avAge (int data) {
        avAge = sumAge/data;
    }

    //print average age
    public void printAge() {
        System.out.println("Average age: "+avAge);
    }
}
