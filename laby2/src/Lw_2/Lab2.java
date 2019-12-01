package Lw_2;

import java.util.Scanner;

public class Lab2 {
    static int checkWoman;
    static int avAge;
    public static void main(String[] args) {

        //create patients
        Scanner in = new Scanner(System.in);
        int numOfPatients;
        System.out.print("Input number of patients:");
        numOfPatients = in.nextInt();
        Patient patient[] = new Patient[numOfPatients];
        for (int i = 0; i < numOfPatients; i++) {
            patient[i] = new Patient();
            patient[i].setAllPatientInfo();
        }

        //check Number of woman between patients
        for (int checkWoman = 0; checkWoman < numOfPatients; checkWoman++) {
            patient[checkWoman].numberOfWoman(patient[checkWoman],checkWoman);
        }

        //print number of woman
        patient[checkWoman].printNumber();

        //Average age
        for (int avAge=0; avAge<numOfPatients;avAge++) {
            patient[avAge].sumAge(patient[avAge]);
        }

        //search average age
        patient[avAge].avAge(numOfPatients);

        //print average age
        patient[avAge].printAge();
    }
}

