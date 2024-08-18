package JAVA_HW_Module_01_Ua;

import java.util.Scanner;

public class Task4
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a six-digit number...");
        int num = sc.nextInt();

        // Перетворення числа у рядок для подальшої роботи
        String input = String.valueOf(num);

        // Перевірка чи є введене число шестизначним
        if (input.length() == 6 && input.matches("\\d{6}")) {

            // Перетворення рядка у масив символів для зміни місцями цифр
            char[] digits = input.toCharArray();

            // Зміна місцями першої і шостої цифр
            char temp = digits[0];
            digits[0] = digits[5];
            digits[5] = temp;

            // Зміна місцями другої і п’ятої цифр
            temp = digits[1];
            digits[1] = digits[4];
            digits[4] = temp;

            // Перетворення масиву символів назад у рядок
            String result = new String(digits);

            System.out.println("The transformed number is: " + result);
        }
        else
        {
            System.out.println("Error: Please enter a six-digit number.");
        }

        sc.close();
    }
}
