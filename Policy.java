public class Policy
{
   private int num, age;
   private String provider, fName, lName, smokeStatus;
   private double height, weight;
   
   final double BASEPRICE = 600;
   
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
   
   public int getNum()
   {
      return num;
   }
   
   public void setNum(int number)
   {
      num = number;
   }
   
   public String getProvier()
   {
      return provider;
   }
   
   public void setProvider(String company)
   {
      provider = company;
   }
   
   public String getFName()
   {
      return fName;
   }
   
   public void setFName(String name)
   {
      fName = name;
   }
   
   public String getLName()
   {
      return lName;
   }
   
   public void setLName(String name)
   {
      lName = name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setAge(int num)
   {
      age = num;
   }
   
   public String getSmoke()
   {
      return smokeStatus;
   }
   
   public void setSmoke(String status)
   {
      smokeStatus = status;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public void setHeight(double num)
   {
      height = num;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setWeight(double num)
   {
      weight = num;
   }
   
   public  double getBMI()
   {
      return (weight * 703)/(height * height);
   }
   
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
   
   public String getInfo()
   {
      return String.format("\nPolicy Number: %d\nProvider Name: %s\nPolicyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status: %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f\nPolicy Price: $%.2f", num, provider, fName, lName, age, smokeStatus, height, weight, getBMI(), getPrice());
   }
}