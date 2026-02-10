package Training;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of vendor resources: ");
	        int numResources = sc.nextInt();

	        System.out.print("Enter hours worked per resource: ");
	        int hoursPerResource = sc.nextInt();

	        System.out.print("Enter vendor rate per hour: ");
	        double vendorRate = sc.nextDouble();

	        int totalHours = numResources * hoursPerResource;
	        double revenue = totalHours * vendorRate;

	        System.out.print("Enter hardware/infrastructure cost: ");
	        double hardwareCost = sc.nextDouble();

	        System.out.print("Is hardware cost paid by client? (1-Yes / 0-No): ");
	        int hardwarePaidByClient = sc.nextInt();

	        double vendorHardwareCost;
	        if (hardwarePaidByClient == 1) {
	            vendorHardwareCost = 0.30 * hardwareCost;
	        } else {
	            vendorHardwareCost = hardwareCost;
	        }
	        System.out.print("Enter software license cost: ");
	        double softwareCost = sc.nextDouble();

	        System.out.print("Software type (1-Common / 2-Proprietary): ");
	        int softwareType = sc.nextInt();

	        double vendorSoftwareCost;
	        if (softwareType == 1) {
	            vendorSoftwareCost = 0.50 * softwareCost;
	        } else {
	            vendorSoftwareCost = softwareCost;
	        }
	        System.out.print("Enter number of external consultants: ");
	        int numConsultants = sc.nextInt();

	        System.out.print("Enter consultant hours: ");
	        int consultantHours = sc.nextInt();

	        System.out.print("Enter consultant rate per hour: ");
	        double consultantRate = sc.nextDouble();

	        double consultantCost = numConsultants * consultantHours * consultantRate;
	        
	        double totalCost = vendorHardwareCost
	                         + vendorSoftwareCost
	                         + consultantCost;

	        double result = revenue - totalCost;

	        System.out.println("\n--- Result ---");
	        if (result > 0) {
	            System.out.println("Vendor Profit = " + result);
	        } else if (result < 0) {
	            System.out.println("Vendor Loss = " + Math.abs(result));
	        } else {
	            System.out.println("No Profit No Loss");
	        }

	    }
	}
