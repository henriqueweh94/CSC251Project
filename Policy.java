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
   
   private int setNum(int number)
   {
      num = number;
   }
   
   private String getFName()
   {
      return fName;
   }
   
   private String setFName(String name)
   {
      fName = name;
   }
   
   private String getLName()
   {
      return lName;
   }
   
   private String setLName(String name)
   {
      lName = name;
   }
   
   private int getAge()
   {
      return age;
   }
   
   private int setAge(int num)
   {
      age = num;
   }
   
   private String getSmoke()
   {
      return smokeStatus;
   }
   
   private String setSmoke(String status)
   {
      smokeStatus = status;
   }
   
   private double getHeight()
   {
      return height;
   }
   
   private int setHeight(double num)
   {
      height = num;
   }
   
   private double getWeight()
   {
      return weight;
   }
   
   private int setWeight(double num)
   {
      weight = num;
   }
}