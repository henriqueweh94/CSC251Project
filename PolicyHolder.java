/*
   This class will be used to create Policy Holder Objects
*/
public class PolicyHolder
{  
   //Variable declarations
   private String fName, lName, smokeStatus;
   private int age;
   private double height, weight;
   
   /**
      PolicyHolder constructor. When new instance is created, this method will be called to give the object its initial values.
      @param fName policy holder's first name.
      @param lName policy holder's last name.
      @param age policy holdser's age.
      @param smokeStatus policy holder's smoke status.
      @param height policy holder's height.
      @param weight policy holders' weight.
      
   */
   public PolicyHolder(String fName, String lName, int age, String smokeStatus, double height, double weight)
   {
      this.fName = fName;
      this.lName = lName;
      this.age = age;
      this.smokeStatus = smokeStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /**
      Copy constructor. Called from the Policy classes constructor
   */
   public PolicyHolder(PolicyHolder person)
   {
      fName = person.getFName();
      lName = person.getLName();
      age = person.getAge();
      smokeStatus = person.getSmoke();
      height = person.getHeight();
      weight = person.getWeight();
   }
   
   /**
      No-arg constructor. This constructor will be called if an object is created with no arguments. Values will be defaulted
   */
   public PolicyHolder()
   {
      fName = "N/A";
      lName = "N/A";
      age = 0;
      smokeStatus = "N/A";
      height = 0;
      weight = 0;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The policy holder's first name.
   */
   public String getFName()
   {
      return fName;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param name Policy holder's first name.
   */
   public void setFName(String name)
   {
      fName = name;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The user's last name.
   */
   public String getLName()
   {
      return lName;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param name Policy holder's last name.
   */
   public void setLName(String name)
   {
      lName = name;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The policy holder's age 
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param num Policy holder's age.
   */
   public void setAge(int num)
   {
      age = num;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The policy holder's smoking status.
   */
   public String getSmoke()
   {
      return smokeStatus;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param status Policy holder's smoking status.
   */
   public void setSmoke(String status)
   {
      smokeStatus = status;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The policy holder's height.
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param num Policy holder's height.
   */
   public void setHeight(double num)
   {
      height = num;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The policy holder's weight.
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param num Policy holder's weight.
   */
   public void setWeight(double num)
   {
      weight = num;
   }

   
   public String toString()
   {
      return String.format("\nPolicyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status (smoker/non-smoker): %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds",fName, lName, age, smokeStatus, height, weight);
   }
}