import java.util.Scanner;
class Customer {
    String type;

    Customer(String type) {
        this.type = type;
    }
    public double calculateDiscount(double amount) {
        return 0; 
    }
}

class PremiumCustomer extends Customer {
    PremiumCustomer() { 
    	super("Premium"); 
    	}

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
class CorporateCustomer extends Customer {
    CorporateCustomer() { 
    	super("Corporate"); 
    	}

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20; 
    }
}

public class Poly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Type (1: Regular, 2: Premium, 3: Corporate): ");
        int choice = sc.nextInt();
        
        System.out.print("Enter Order Amount: ₹");
        double amount = sc.nextDouble();

        System.out.print("Is coupon applied? (true/false): ");
        boolean isCouponApplied = sc.nextBoolean();

        Customer customer;
        if (choice == 2) {
            customer = new PremiumCustomer();
        } else if (choice == 3) {
            customer = new CorporateCustomer();
        } else {
            customer = new Customer("Regular");
        }

        double baseDiscount = customer.calculateDiscount(amount);
        double couponDiscount = 0;
        
        if (isCouponApplied) {
            couponDiscount = 500; 
        }

        double finalAmount = amount - baseDiscount - couponDiscount;
        
        System.out.println("\n--- Final Bill ---");
        System.out.println("Customer Type: " + customer.type);
        System.out.println("Base Discount Applied: ₹" + baseDiscount);
        
        if (isCouponApplied) {
            System.out.println("Coupon Discount: ₹" + couponDiscount);
        } else {
            System.out.println("Coupon Discount: ₹0 (No coupon used)");
        }
        
        System.out.printf("Final Payable Amount: ₹%.2f%n", finalAmount);
    }
}