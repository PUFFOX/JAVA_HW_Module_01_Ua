package JAVA_HW_Module_01_Ua;

import java.util.Scanner;

public class Task2
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number...");
        double value = sc.nextDouble();

        System.out.println("Input percent...");
        double percent = sc.nextDouble();

        double result = calculatePercentage (value, percent);
        System.out.println(percent + "% " + value + " = " + result );
        sc.close();
    }

    // Метод для обчислення відсотка
    public static double calculatePercentage(double value, double percent)
    {
        return (value * percent) / 100.0;
    }
}