package JAVA_HW_Module_01_Ua;


import java.util.Arrays;
import java.util.Scanner;

public class Task12
{
    public static void run()
    {
        int[] array = {5, 3, 8, 1, 9, 2}; // Початковий масив

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose sorting order: 'asc' for ascending, 'desc' for descending");
        String order = sc.nextLine();

        // Виклик методу для сортування масиву
        sortArray(array, order);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    // Метод для сортування масиву
    public static void sortArray(int[] array, String order) {
        if (order.equalsIgnoreCase("asc"))
        {
            // Сортування за зростанням
            Arrays.sort(array);
        }
        else if (order.equalsIgnoreCase("desc"))
        {
            // Сортування за спаданням
            Arrays.sort(array);
            // Інверсія масиву для спадання
            for (int i = 0; i < array.length / 2; i++)
            {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
        else
        {
            System.out.println("Invalid input. Please choose 'asc' or 'desc'.");
        }
    }

}

