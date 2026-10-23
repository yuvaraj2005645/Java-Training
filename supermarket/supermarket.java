import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double groceryTotal = 0;
        double fruitsTotal = 0;
        double dairyTotal = 0;
        double grandTotal = 0;

        int choice, quantity;
        char more;

        do {
            System.out.println("\n===== SUPERMARKET =====");
            System.out.println("1. Grocery");
            System.out.println("2. Fruits");
            System.out.println("3. Dairy Products");
            System.out.println("4. GrandTotal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Grocery ---");
                    System.out.println("1. Rice     - Rs. 60/kg");
                    System.out.println("2. Sugar    - Rs. 45/kg");
                    System.out.print("Select product: ");
                    int g = sc.nextInt();

                    System.out.println("Enter qunantity in kg:");
                    quantity = sc.nextInt();
                    switch(g){
                        case 1:
                            groceryTotal+=60*quantity;
                            break;
                        case 2 :
                            groceryTotal+=45*quantity;
                            break;
                        default:
                            System.out.println("invalid product!");

                    }
                    break;

                case 2:
                    System.out.println("\n--- Fruits ---");
                    System.out.println("1. Apple  - Rs. 120/kg");
                    System.out.println("2. Banana - Rs. 50/kg");
                    System.out.print("Select product: ");
                    int f = sc.nextInt();

                    System.out.print("Enter quantity in kg: ");
                    quantity = sc.nextInt();

                    switch (f) {
                        case 1:
                            fruitsTotal += 120 * quantity;
                            break;
                        case 2:
                            fruitsTotal += 50 * quantity;
                            break;
                        default:
                            System.out.println("Invalid product!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Dairy Products ---");
                    System.out.println("1. Milk   - Rs. 30/litre");
                    System.out.println("2. Curd   - Rs. 40/packet");
                    System.out.print("Select product: ");
                    int d = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();

                    switch (d) {
                        case 1:
                            dairyTotal += 30 * quantity;
                            break;
                        case 2:
                            dairyTotal += 40 * quantity;
                            break;
                        default:
                            System.out.println("Invalid product!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== FINAL BILL =====");
                    System.out.println("Grocery Total : Rs. " + groceryTotal);
                    System.out.println("Fruits Total  : Rs. " + fruitsTotal);
                    System.out.println("Dairy Total   : Rs. " + dairyTotal);

                    grandTotal = groceryTotal
                               + fruitsTotal
                               + dairyTotal;

                    System.out.println("---------------------");
                    System.out.println("Grand Total   : Rs. " + grandTotal);
                    
                    break;

                default:
                    System.out.println("Invalid category!");
                case 5:
                    System.out.println("Thank you for shopping!");
                    more = 'n';
            }

            if (choice != 4) {
                System.out.print("Do you want to add another item? (y/n): ");
                more = sc.next().charAt(0);
            } else {
                more = 'n';
            }

        } while (more == 'y' || more == 'Y');

        sc.close();
    }
}

