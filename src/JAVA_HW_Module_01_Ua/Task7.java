package JAVA_HW_Module_01_Ua;

import java.util.Scanner;

public class Task7
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int start = sc.nextInt();

        System.out.println("Enter the second number:");
        int end = sc.nextInt();

        // Нормалізація границь
        if (start > end)
        {
            int temp = start;
            start = end;
            end = temp;
        }
        System.out.println("Odd numbers between " + start + " and " + end + ":");

        // Виведення непарних чисел у діапазоні
        for (int i = start; i <= end; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
