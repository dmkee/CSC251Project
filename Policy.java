public class Policy {
   // Fields for the insurance policy
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String smokingStatus; // Indicate if "Smoker" or "Non-Smoker"
   private double height; // Given in inches
   private double weight; // Given in pounds
   
   // No-arg constructor
   public Policy() {
      policyNumber = 0;
      providerName = "";
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderAge = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
      
   // Full-srg constructor
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolderFirstName = firstName;
      this.policyHolderLastName = lastName;
      this.policyHolderAge = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   // Accessor Methods
   public int getPolicyNumber() {
      return policyNumber;
   }
   
   public String getProviderName() {
      return providerName;
   }
   
   public String getPolicyHolderFirstName() {
      return policyHolderFirstName;
   }
   
   public String getPolicyHolderLastName() {
      return policyHolderLastName;
   }
   
   public int getPolicyHolderAge() {
      return PolicyHolderAge;
   }
   
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   public double getHeight() {
      return height;
   }
   
   public double getWeight() {
      return weight;
   }
   
   // Mutator Methods
   public void setPolicyNumber(int policyNumber) {
      this.policyNumber = policyNUmber;
   }
   
   public void setProivderName(String providerName) {
      this.providerName = providerName;
   }
   
   public void setPolicyHolderFirstName(String firstName) {
      this.policyHolderFirstName = firstName;
   }
   
   public void setPolicyHolderLastName(String lastName) {
      this.policyHolderLastName = lastName;
   }
   
   public void setPolicyHolderAge(int age) {
      this.policyHolderAge = age;
   }
   
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }
   
   public void setHeight(double height) {
      this.height = height;
   }
   
   public void setWeight(double weight) {
      this.weight = weight;
   }
   
   // Calculation for BMI
   public double calculateBMI() {
      return (weight * 703) / (height * weight);
   }
   
   // Method to calculate the insuranc policy price
   public double calculatePolicyPrice() {
      doble price = 600.0;
      
      if (policyHolderAge > 50) {
         price += 75;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         price += 100;
      }
      
      double bmi = calculateBMI();
         if (bmi > 35) {
            price += (bmi - 35) * 20;
         }
         
         return price;
         
    }
 }