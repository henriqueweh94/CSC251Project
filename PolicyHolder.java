/*
   This class will be used to create Policy Holder Objects
*/
public class PolicyHolder
{  
   //Variable declarations
   public Policy()
   {
      private String fName, lName, smokeStatus;
      private int age;
      private double height, weight;
   }
   
   /**
      Policy constructor. When new instance is created, this method will be called to give the object its initial values.
      @param fName policy holder's first name.
      @param lName policy holder's last name.
      @param age policy holdser's age.
      @param smokeStatus policy holder's smoke status.
      @param height policy holder's height.
      @param weight policy holders' weight.
      
   */
   public Policy(String fName, String lName, int age, String smokeStatus, double height, double weight)
   {
      this.fName = fName;
      this.lName = lName;
      this.age = age;
      this.smokeStatus = smokeStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /**
      No-arg constructor. This constructor will be called if an object is created with no arguments. Values will be defaulted
   */
   public Policy()
   {
      fName = "N/A";
      lName = "N/A";
      age = 0;
      smokeStatus = "N/A";
      height = 0;
      weight = 0;
   }
   
   public String toString()
   {
      return String.format("\nPolicyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status (smoker/non-smoker): %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds",fName, lName, age, smokeStatus, height, weight);
   }
   
}