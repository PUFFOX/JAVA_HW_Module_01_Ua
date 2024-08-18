package JAVA_HW_Module_01_Ua;

public class Task11
{
    public static void run()
    {
        // Виклик методу для горизонтальної лінії
        drawLine(10, "horizontal", '*');

        // Виклик методу для вертикальної лінії
        drawLine(5, "vertical", '#');
    }

    // Метод для відображення лінії
    public static void drawLine(int length, String direction, char symbol) {
        if (direction.equalsIgnoreCase("horizontal")) {
            // Горизонтальна лінія
            for (int i = 0; i < length; i++)
            {
                System.out.print(symbol);
            }
            System.out.println(); // Перехід на новий рядок після горизонтальної лінії
        }
        else if (direction.equalsIgnoreCase("vertical")) {
            // Вертикальна лінія
            for (int i = 0; i < length; i++)
            {
                System.out.println(symbol);
            }
        }
        else
        {
            System.out.println("Invalid direction. Please choose 'horizontal' or 'vertical'.");
        }
    }
}
