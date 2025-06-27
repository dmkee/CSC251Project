public class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private boolean smoker;
   private double height; //in inches
   private double weight; //in pounds
   
   public PolicyHolder(String firstName, String lastName, int age, boolean smoker, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smoker = smoker;
      this.height = height;
      this.weight = weight;
   }
   
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public int getAge() { return age; }
   public boolean isSmoker() { return smoker; }
   public double getHeight() { return height; }
   public double getWeight() { return weight; }
   
   public double calculateBMI() {
      return (weight * 703) / (height * weight);
   }
   
   public String toString() {
      return String.format("PolicyHolder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\n" + "Policyholder's Smoking Status (Y/N): %s\nPolicyHolder's Height: %.1f inches\n" + "PolicyHolder's Weight: %.1f pounds\nPolicyHolder's BMI: %.2f", firstName, lastName, age, (smoker ? "smoker" : "non-smoker"), height, weight, calculateBMI());
   }
}