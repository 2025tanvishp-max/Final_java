import java.util.Scanner;

public class CourierSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store parcel records
        int[] parcelId = new int[100];
        String[] customerName = new String[100];
        double[] weight = new double[100];
        double[] charge = new double[100];
        int[] deliveryType = new int[100];

        int count = 0;
        int choice;

        System.out.println("==========================================");
        System.out.println("       COURIER & PARCEL MANAGEMENT");
        System.out.println("==========================================");

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Register Parcel");
            System.out.println("2. Search Parcel");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count >= 100) {
                        System.out.println("Parcel storage is full!");
                        break;
                    }

                    System.out.println("\n------ REGISTER PARCEL ------");

                    System.out.print("Enter Parcel ID: ");
                    parcelId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    customerName[count] = sc.nextLine();

                    System.out.print("Enter Parcel Weight (kg): ");
                    weight[count] = sc.nextDouble();

                    System.out.println("\nSelect Delivery Type:");
                    System.out.println("1. Normal");
                    System.out.println("2. Express");
                    System.out.println("3. Same Day");
                    System.out.print("Enter choice: ");

                    deliveryType[count] = sc.nextInt();

                    /*
                     * Calculate delivery charge.
                     * Sample rates are used because the case study
                     * does not specify fixed rates.
                     */

                    double baseCharge;

                    // switch for delivery category
                    switch (deliveryType[count]) {

                        case 1:
                            baseCharge = 50;
                            break;

                        case 2:
                            baseCharge = 100;
                            break;

                        case 3:
                            baseCharge = 150;
                            break;

                        default:
                            System.out.println("Invalid delivery type.");
                            baseCharge = 50;
                            deliveryType[count] = 1;
                    }

                    // if-else based on parcel weight
                    if (weight[count] <= 2) {
                        charge[count] = baseCharge;
                    } else if (weight[count] <= 5) {
                        charge[count] = baseCharge + (weight[count] - 2) * 20;
                    } else {
                        charge[count] = baseCharge + 60
                                + (weight[count] - 5) * 30;
                    }

                    // Generate receipt
                    System.out.println("\n=================================");
                    System.out.println("         PARCEL RECEIPT");
                    System.out.println("=================================");
                    System.out.println("Parcel ID       : " + parcelId[count]);
                    System.out.println("Customer Name   : " + customerName[count]);
                    System.out.println("Weight          : " + weight[count] + " kg");

                    System.out.print("Delivery Type   : ");

                    switch (deliveryType[count]) {
                        case 1:
                            System.out.println("Normal");
                            break;
                        case 2:
                            System.out.println("Express");
                            break;
                        case 3:
                            System.out.println("Same Day");
                            break;
                    }

                    System.out.printf("Delivery Charge : Rs. %.2f%n", charge[count]);
                    System.out.println("=================================");

                    count++;

                    System.out.println("Parcel registered successfully!");

                    break;

                case 2:

                    System.out.println("\n------ SEARCH PARCEL ------");

                    if (count == 0) {
                        System.out.println("No parcel records available.");
                        break;
                    }

                    System.out.print("Enter Parcel ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    // Linear search
                    for (int i = 0; i < count; i++) {

                        if (parcelId[i] == searchId) {

                            System.out.println("\n=================================");
                            System.out.println("         PARCEL DETAILS");
                            System.out.println("=================================");
                            System.out.println("Parcel ID       : " + parcelId[i]);
                            System.out.println("Customer Name   : " + customerName[i]);
                            System.out.println("Weight          : " + weight[i] + " kg");

                            System.out.print("Delivery Type   : ");

                            switch (deliveryType[i]) {
                                case 1:
                                    System.out.println("Normal");
                                    break;
                                case 2:
                                    System.out.println("Express");
                                    break;
                                case 3:
                                    System.out.println("Same Day");
                                    break;
                            }

                            System.out.printf("Delivery Charge : Rs. %.2f%n",
                                    charge[i]);

                            System.out.println("=================================");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Parcel not found!");
                    }

                    break;

                case 3:

                    System.out.println("\nThank you for using");
                    System.out.println("Courier & Parcel Management System!");

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}