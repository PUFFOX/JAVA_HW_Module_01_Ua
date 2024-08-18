package JAVA_HW_Module_01_Ua;

import java.util.Scanner;

public class Task3
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number...");
        int oneNum = sc.nextInt();

        System.out.println("Input second number...");
        int twoNum = sc.nextInt();

        System.out.println("Input third number...");
        int threeNum = sc.nextInt();


        String combinetString = String.valueOf(oneNum) +
                String.valueOf(twoNum) +
                String.valueOf(threeNum);

        int combinetNumber = Integer.parseInt(combinetString);

        System.out.println("Combinet number: " + combinetNumber);




    }
}
