/*
   Henrique Weh
   CSC251-N802
   This is the demo code for the Policy class
*/

import java.util.Scanner;//Import for the Scanner class to read keyboard inputs
import java.util.ArrayList;//Import of the ArrayList class
import java.io.*;//Import used to read/write to a file

public class Project_henrique_weh
{
   public static void main(String args[]) throws IOException
   {  
      //variable declarations
      int num, age;
      String provider, fName, lName, smokeStatus;
      double height, weight;
      
      int smokers = 0, nonsmokers = 0;
      
     // Scanner keyboard = new Scanner(System.in);//variable to read keyboard inputs
     
      File policyinfo = new File("PolicyInformation.txt");//creating a file object
      Scanner read = new Scanner(policyinfo);//creatint a scanner object to read the file
      
      ArrayList<Policy> policies = new ArrayList<Policy>();//ArrayList that will store policy objects
      
      //while loop is used to read the PolicyInformation file. As long as there is something in the file, the loop will continue to read it.
      while(read.hasNext())
      {
         num = read.nextInt();
         read.nextLine();
         provider = read.nextLine();
         fName = read.nextLine();
         lName = read.nextLine();
         age = read.nextInt();
         read.nextLine();
         smokeStatus = read.nextLine();
         height = read.nextDouble();
         weight = read.nextDouble();
         
         policies.add(new Policy(num, provider, fName, lName, age, smokeStatus, height, weight));
      }
      read.close();
      
      //for loop that will print the contents of the file. It will also count the number of smokers and non-smokers in the file.
      for(int i = 0; i < policies.size(); i++)
      {
         System.out.println(policies.get(i).getInfo());
         
         if(policies.get(i).getSmoke().equalsIgnoreCase("smoker"))
         {
            smokers++;
         }
         else
         {
            nonsmokers++;
         }
      } 
      
      System.out.println("\nThe numberof policies with a smoker is: " + smokers);
      System.out.println("The numberof policies with a non-smoker is: " + nonsmokers);
   }
}