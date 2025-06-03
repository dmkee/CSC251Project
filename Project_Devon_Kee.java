import java.util.Scanner;

public class Project_Devon_Kee {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Collect input from the user
      System.out.print("Please enter the Policy Number: ");
      int policyNumber = input.nextInt();
      input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      String providerName = input.nextLine();
      
      System.out.print("Please enter the PolicyHolder's First Name: ");
      String firstName = input.nextLine();
      
      System.out.print("Please enter the PolicyHolder's Last Name: ");
      String lastName = input.nextLine();
      
      System.out.print("Please enter the PolicyHolder's Age: ");
      int age = input.nextInt();
      input.nextLine();
      
      System.out.print("Please enter the PolicyHolder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = input.nextLine();
      
      System.out.print("Please enter the PolicyHolder's Height (in inches): ");
      double height = input.nextDouble();
      
      System.out.print("Please enter the PolicyHolder's Weight (in pounds): ");
      double weight = input.nextDouble();
      
      // Creating the policy by using the constructor with arguments
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      // Output the policy Information
      System.out.println();
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("PolicyHolder's First Name: " + policy.getPolicyHolderFirstName());
      System.out.println("PolicyHolder's Last Name: " + policy.getPolicyHolderLastName());
      System.out.println("PolicyHolder's Age: " + policy.getPolicyHolderAge());
      System.out.println("PolicyHolder's Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("PolicyHolder's Height: %.1f inches\n", policy.getHeight());
      System.out.printf("PolicyHolder's Weight: %.1f pounds\n", policy.getWeight());
      System.out.printf("PolicyHolder's BMI: 5.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
      
      input.close();
      
   }
}