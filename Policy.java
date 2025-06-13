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
   
   /** This is the defualt constructor for the Policy class. It will allow the values to initalize with defualt values. */
   public Policy() {
      policyNumber = 0;
      providerName = "";
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderAge = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
      
   /* Full constructor for the Policy Class
   
   @param policyNumber The policy number
   @param providerName The insurance's provider's name.
   @param firstName The First name of the policyholder.
   @param lastName The Last name of the policyholder.
   @param age The age of the policyholder.
   @param smokingStatus The smoking Status of the policyHolder.
   @param height The height of the policyholder in inches.
   @param weight The weight of the policyholder in pounds.
 
   */
   
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
   
   // Getters and Setters
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
      return policyHolderAge;
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
      this.policyNumber = policyNumber;
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
   
   
   /* Calculation for BMI for the policyholder
   
   @return The BMI value
   
   */
   public double calculateBMI() {
      return (weight * 703) / (height * weight);
   }
   
   /* Method to calculate the insuranc policy price
   
   @return The price of the policy.
   
   */ 
   public double calculatePolicyPrice() {
      double price = 600.0;
      
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