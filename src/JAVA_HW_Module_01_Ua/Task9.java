package JAVA_HW_Module_01_Ua;

import java.util.Random;
import java.util.Scanner;

public class Task9
{
    public static void run ()
    {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20]; // Масив з 20 елементів
        Random random = new Random();

        // Заповнення масиву випадковими числами від -50 до 50
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(101) - 50; // Випадкове число від -50 до 50
        }

        // Ініціалізація змінних для обчислень
        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Обчислення мінімального, максимального значення, кількості від’ємних, додатних значень і нулів
        for (int num : array)
        {
            if (num < min)
            {
                min = num;
            }
            if (num > max)
            {
                max = num;
            }
            if (num < 0)
            {
                negativeCount++;
            }
            else if (num > 0)
            {
                positiveCount++;
            }
            else
            {
                zeroCount++;
            }
        }

        // Виведення результатів на екран
        System.out.println("Array: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }

        System.out.println("\n\nMinimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Negative values count: " + negativeCount);
        System.out.println("Positive values count: " + positiveCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
