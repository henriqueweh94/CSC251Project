/**
   The policy class will create an instance of the users account with an insurance agency
*/
public class Policy
{
   //Variable declarations
   private int num;
   private String provider;
   private PolicyHolder holder;
   
   //named constant of for the base price of the policy
   final double BASEPRICE = 600;
   
   /**
      Policy constructor. When new instance is created, this method will be called to give the object its initial values.
      @param num Policy number.
      @param provider Insurence provider.
      
   */
   public Policy(int num, String provider, PolicyHolder holder)
   {
      this.num = num;
      this.provider = provider;
      this.holder = new PolicyHolder(holder);
   }
   
   /**
      No-arg constructor. This constructor will be called if an object is created with no arguments. Values will be defaulted
   */
   public Policy()
   {
      num = 1111;
      provider = "N/A";
      holder = new PolicyHolder();
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
      @return The policy holder object.
   */
   public PolicyHolder getHolder()
   {
      return new PolicyHolder(holder);
   }
   
   /**
      This method will calculate the total BMI of the policy holder. This number will be returned as a double
      @return The result of the BMI calculation
   */
   public  double getBMI()
   {
      return (holder.getWeight() * 703)/(holder.getHeight() * holder.getHeight());
   }
   
   /**
      This method will calculate the total price of the policy returned as a double
      @return The price of the policy based off of the policy holders age, smoking status and BMI.
   */
   public double getPrice()
   {
      double price = BASEPRICE;
      
      if (holder.getAge() > 50) 
         price += 75;
      if (holder.getSmoke().equalsIgnoreCase("smoker"))
         price += 100;
      if (getBMI() > 35)
         price += ((getBMI() - 35)*20);
      return price;
   }
   
   /**
      This method will return a String with all  the information of the policy holder
      @return A string with all of the policy holder's information.
   */
   public String toString()
   {
      return String.format("\nPolicy Number: %d\nProvider Name: %s %s \nPolicyholder's BMI: %.2f\nPolicy Price: $%.2f", num, provider, holder.toString(), getBMI(), getPrice());
   }
}