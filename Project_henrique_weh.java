/*
   Henrique Weh
   CSC251-N802
   This is the demo code for the Policy class
*/

import java.util.Scanner;//Import for the Scanner class to read keyboard inputs

public class Project_henrique_weh
{
   public static void main(String args[])
   {  
      //variable declarations
      int num, age;
      String provider, fName, lName, smokeStatus;
      double height, weight;
      
      Scanner keyboard = new Scanner(System.in);//variable to read keyboard inputs
      
      //User Prompts for input
      System.out.print("Please enter the Policy Number: ");
      num = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Provider Name: ");
      provider = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      fName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      lName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status: ");
      smokeStatus = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height: ");
      height = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight: ");
      weight = keyboard.nextDouble();
      
      //Creating a object of the Policy class called P1
      Policy p1 = new Policy(num, provider, fName, lName, age, smokeStatus, height, weight);
      
      System.out.println(p1.getInfo());
      
   }
}