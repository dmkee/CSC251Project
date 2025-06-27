public class Policy {
   private static int policyCount = 0; //Static field to track object count
   
   private int policyNumber;
   private String providerName;
   private PolicyHolder holder;
   
   public Policy(int policyNumber, String providerName, PolicyHolder holder) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.holder = new PolicyHolder(
         holder.getFirstName(),
         holder.getLastName(),
         holder.getAge(),
         holder.isSmoker(),
         holder.getHeight(),
         holder.getWeight()); // Deep copy to prevent security risk
         policyCount++;
   }
   
   public int getPolicyNumber() { return policyNumber; }
   public String getProviderName() { return providerName; }
   public PolicyHolder getPolicyHolder() { return new PolicyHolder(
      holder.getFirstName(),
      holder.getLastName(),
      holder.getAge(),
      holder.isSmoker(),
      holder.getHeight(),
      holdergetWeight()); }
   
   public double calculatePolicyPrice() {
      double basePrice = 600.0;
      if (holder.getAge() > 50) basePrice += 75.0;
      if (holder.isSmoker()) basePrice += 100.0;
      if (holder.calculateBMI() > 35) basePrice += 75.0;
      return basePrice;
   }
   
   public static int getPolicyCount() { return policyCount; }
   
   public String toStirng() {
      return String.format("Policy Number: %d\nProvider Name: %s\n%s\nPolicy Price: $%.2f\n", policyNumber, providerName, holder.toString(), calculatePolicyPrice());
   }
}