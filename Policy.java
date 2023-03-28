/**
   The policy class will create an instance of the users account with an insurance agency
*/
public class Policy
{
   //Variable declarations
   private int num;
   private String provider;
   
   //named constant of for the base price of the policy
   final double BASEPRICE = 600;
   
   /**
      Policy constructor. When new instance is created, this method will be called to give the object its initial values.
      @param num Policy number.
      @param provider Insurence provider.
      @param fName policy holder's first name.
      @param lName policy holder's last name.
      @param age policy holdser's age.
      @param smokeStatus policy holder's smoke status.
      @param height policy holder's height.
      @param weight policy holders' weight.
      
   */
   public Policy(int num, String provider, String fName, String lName, int age, String smokeStatus, double height, double weight)
   {
      this.num = num;
      this.provider = provider;
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
      num = 1111;
      fName = "N/A";
      lName = "N/A";
      age = 0;
      smokeStatus = "N/A";
      height = 0;
      weight = 0;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The policy number
   */
   public int getNum()
   {
      return num;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param number Policy number.
   */
   public void setNum(int number)
   {
      num = number;
   }
   
   /**
      accessor method. Used to get info from object when needed.
      @return The name of the service provider.
   */
   public String getProvier()
   {
      return provider;
   }
   
   /**
      mutator method. Used to change the data in the constructor
      @param company Insurence provider's name.
   */
   public void setProvider(String company)
   {
      provider = company;
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
   
   /**
      This method will calculate the total BMI of the policy holder. This number will be returned as a double
      @return The result of the BMI calculation
   */
   public  double getBMI()
   {
      return (weight * 703)/(height * height);
   }
   
   /**
      This method will calculate the total price of the policy returned as a double
      @return The price of the policy based off of the policy holders age, smoking status and BMI.
   */
   public double getPrice()
   {
      double price = BASEPRICE;
      
      if (age > 50) 
         price += 75;
      if (smokeStatus.equalsIgnoreCase("smoker"))
         price += 100;
      if (getBMI() > 35)
         price += ((getBMI() - 35)*20);
      return price;
   }
   
   /**
      This method will return a String with all  the information of the policy holder
      @return A string with all of the policy holder's information.
   */
   public String getInfo()
   {
      return String.format("\nPolicy Number: %d\nProvider Name: %s\nPolicyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status (smoker/non-smoker): %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f\nPolicy Price: $%.2f", num, provider, fName, lName, age, smokeStatus, height, weight, getBMI(), getPrice());
   }
}