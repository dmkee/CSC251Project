import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/*

This class reads the policy data from a text file and display the policy Details.
It allow keeps track of smokers and non-smokers.

*/

public class Project_Devon_Kee {
   public static void main(String[] args) {
      ArrayList<Policy> policies = new ArrayList<>();
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      try {
         File file = new File("PolicyInformation.txt");
         Scanner fileScanner = new Scanner(file);
         
         while(fileScanner.hasNextLine()) {
            int policyNumber = Integer.parseInt(fileScanner.nextLine());
            String providerName = fileScanner.nextLine();
            String firstName = fileScanner.nextLine();
            String lastName = fileScanner.nextLine();
            int age = Integer.parseInt(fileScanner.nextLine());
            String smokingStatus = fileScanner.nextLine();
            double height = Double.parseDouble(fileScanner.nextLine());
            double weight = Double.parseDouble(fileScanner.nextLine());
            
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
         }
         
         fileScanner.close();
      }  catch (FileNotFoundException e)  {
         System.out.println("PolicyInformation.txt file not found.");
         return;
      }
         
      for (Policy policy : policies) {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("PolicyHolder's First Name: " + policy.getPolicyHolderFirstName());
         System.out.println("PolicyHolder's Last Name: " + policy.getPolicyHolderLastName());
         System.out.println("PolicyHolder's Age: " + policy.getPolicyHolderAge());
         System.out.println("PolicyHolder's Smoking Status: " + policy.getSmokingStatus());
         System.out.printf("PolicyHolder's Height: %.1f inches\n", policy.getHeight());
         System.out.printf("PolicyHolder's Weight: %.1f pounds\n", policy.getWeight());
         System.out.printf("PolicyHolder's BMI: %.2f%n", policy.calculateBMI());
         System.out.printf("Policy Price: $%.2f%n%n", policy.calculatePolicyPrice());
         
         if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smokerCount++;
         }  else  {
            nonSmokerCount++;
         }
      }
      
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}