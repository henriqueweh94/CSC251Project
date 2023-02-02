public class Policy
{
   private int num, age;
   private String fName, lName, smokeStatus;
   private double height, weight;
   
   public Policy(int num, String fName, String lName, int age, String smokeStatus, double height, double weight)
   {
      this.num = num;
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
   
   private int getNum()
   {
      return num;
   }
   
   private void setNum(int number)
   {
      num = number;
   }
   
   private String getFName()
   {
      return fName;
   }
   
   private void setFName(String name)
   {
      fName = name;
   }
   
   private String getLName()
   {
      return lName;
   }
   
   private void setLName(String name)
   {
      lName = name;
   }
   
   private int getAge()
   {
      return age;
   }
   
   private void setAge(int num)
   {
      age = num;
   }
   
   private String getSmoke()
   {
      return smokeStatus;
   }
   
   private void setSmoke(String status)
   {
      smokeStatus = status;
   }
   
   private double getHeight()
   {
      return height;
   }
   
   private void setHeight(double num)
   {
      height = num;
   }
   
   private double getWeight()
   {
      return weight;
   }
   
   private void setWeight(double num)
   {
      weight = num;
   }
}