package JAVA_HW_Module_01_Ua;

import java.util.Scanner;

public class Task5
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month number (1-12)");
        int month = sc.nextInt();

        switch(month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month! Please enter a valid month number (1-12)");
        }
    }
}
