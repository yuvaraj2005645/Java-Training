import java.io.FileWriter;
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
            System.out.println("5. Show bill on File");
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
                
                /*case 5:
                    grandTotal = groceryTotal + fruitsTotal + dairyTotal;

                    try {
                        FileWriter writer = new FileWriter("bill.txt");

                        writer.write("===== SUPERMARKET BILL =====\n");
                        writer.write("Grocery Total: Rs. " + groceryTotal + "\n");
                        writer.write("Fruits Total: Rs. " + fruitsTotal + "\n");
                        writer.write("Dairy Total: Rs. " + dairyTotal + "\n");
                        writer.write("Grand Total: Rs. " + grandTotal + "\n");
                        writer.write("Thank you for shopping!\n");

                        writer.close();

                        System.out.println("Bill created successfully!");
                        System.out.println("File location: " +
                                new java.io.File("bill.txt").getAbsolutePath());

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;*/
    

        case 5:
            grandTotal = groceryTotal + fruitsTotal + dairyTotal;

            try {
                FileWriter writer = new FileWriter("bill.txt");

                writer.write("===== SUPERMARKET BILL =====\n");
                writer.write("Grocery Total : Rs. " + groceryTotal + "\n");
                writer.write("Fruits Total  : Rs. " + fruitsTotal + "\n");
                writer.write("Dairy Total   : Rs. " + dairyTotal + "\n");
                writer.write("-----------------------------\n");
                writer.write("Grand Total   : Rs. " + grandTotal + "\n");
                writer.write("Thank you for shopping!\n");

                writer.close();

                ProcessBuilder pb = new ProcessBuilder(
                    "notepad.exe",
                    new java.io.File("bill.txt").getAbsolutePath()
                );
                pb.start();

                System.out.println("Bill opened in Notepad!");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            break;
                
                

                default:
                    System.out.println("Invalid category!");
                break;
            }

            if (choice == 4 || choice == 5) {
                more = 'n';
            } else {
                System.out.print("Do you want to add another item? (y/n): ");
                more = sc.next().charAt(0);
            }

        } while (more == 'y' || more == 'Y');

        sc.close();
    }
}

