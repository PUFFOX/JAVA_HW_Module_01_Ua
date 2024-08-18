package JAVA_HW_Module_01_Ua;

import java.util.Scanner;

public class Task6
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of meters:");
        double meters = sc.nextDouble();

        System.out.println("Choose a conversion option:");
        System.out.println("1 - Convert to miles");
        System.out.println("2 - Convert to inches");
        System.out.println("3 - Convert to yards");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                double miles = convertToMiles(meters);
                System.out.println(meters + " meters is equal to " + miles + " miles.");
                break;
            case 2:
                double inches = convertToInches(meters);
                System.out.println(meters + " meters is equal to " + inches + " inches.");
                break;
            case 3:
                double yards = convertToYards(meters);
                System.out.println(meters + " meters is equal to " + yards + " yards.");
                break;
            default:
                System.out.println("Error: Please choose a valid option (1, 2, or 3).");
                break;
        }
        sc.close();
    }
    public static double convertToMiles(double meters)
    {
        return Math.round((meters / 1609.344) * 100.0) / 100.0; // Округлення до 2 знаків
    }

    public static double convertToInches(double meters)
    {
        return Math.round((meters * 39.3701) * 100.0) / 100.0; // Округлення до 2 знаків
    }

    public static double convertToYards(double meters)
    {
        return Math.round((meters * 1.09361) * 100.0) / 100.0; // Округлення до 2 знаків
    }
}
