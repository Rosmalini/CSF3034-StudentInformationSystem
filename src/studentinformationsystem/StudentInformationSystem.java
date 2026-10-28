/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
Author: Rosmalini Binti Razali
Program Name: StudentProfile.java
Description: To demonstrate a simple Java Program
Date:29 October 2026
Modified Date: None
Version: 1.0
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double mark1 = 80;
        double mark2 = 75;
        double total = mark1 + mark2;
        
        System.out.println("Rosmalini Binti Razali");
        System.out.println("S87292");
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);
        
        if (total >= 150) {
            System.out.println("Result: Excellent");
        } else if (total >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
