package Training;
import java.util.*;

public class CityLib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BorrowUtility utility = new BorrowUtility();
        List<BorrowRec> tempList = new ArrayList<>();
 
        System.out.println("Enter the number of records");
        int n = sc.nextInt();
        sc.nextLine(); 

        if (n <= 0) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Enter borrow details");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split("/");

            String title = parts[0];
            int copies = Integer.parseInt(parts[1]);
            double fine = Double.parseDouble(parts[2]);
            if (copies <= 0) {
                System.out.println("Copies should be a valid number");
                return;
            }

            tempList.add(new BorrowRec(title, copies, fine));
        }

        utility.setRecList(tempList);
        
        BorrowRec maxRecord = utility.findMax(utility.convertToStream());
        
        if (maxRecord != null) {
            System.out.println(maxRecord.getBookTitle() + " had the highest borrow count with " + 
                               maxRecord.getCopiesBorrowed() + " copies");
        }
    }
}