package activity_2;

import java.util.Scanner;

public class desktopmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the laptop's processor: ");
        String P = input.nextLine();

        System.out.println("Enter the brand: ");
        String B = input.nextLine();

        System.out.println("Enter the RAM size (GB): ");
        double R = input.nextDouble();

        Desktop o = new Desktop();
        o.setBrand(B);
        o.setRamsize(R);
        o.setProcessor(P);

        System.out.println("\n--- Current Details ---");
        o.displayInfo();

        input.nextLine();

        System.out.println("\nDo you want to change (upgrade) your RAM size? (yes/no): ");
        String Question = input.nextLine();

        if (Question.equalsIgnoreCase("yes")) {
            System.out.println("Enter how many GB of RAM you want to add: ");
            double noram = input.nextDouble();
            o.upgradeRam(noram);
        } else {
            System.out.println("No RAM upgrade selected.");
        }

        System.out.println("\n--- Final Details ---");
        o.displayInfo();
    }
}
