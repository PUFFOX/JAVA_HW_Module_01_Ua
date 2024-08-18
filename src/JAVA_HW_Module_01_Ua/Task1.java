package JAVA_HW_Module_01_Ua;

public class Task1
{
    public static void run()
    {
        String quote = "Your time is limited,\n" +
                "so don’t waste it\n" +
                "living someone else’s life\n" +
                "Steve Jobs";

        // Виклик функції для додавання відступів
        String formattedQuote = addIndentation(quote, 2);
        System.out.println(formattedQuote);
    }
    // Метод для додавання відступів до кожного рядка
    public static String addIndentation(String text, int indentation)
    {
        String[] lines = text.split("\n"); // Розбиваємо текст на рядки
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lines.length; i++)
        {
            // Додаємо пробіли на початку кожного рядка
            for (int j = 0; j < i * indentation; j++) {
                result.append(" ");
            }
            result.append(lines[i]).append("\n");
        }

        return result.toString();
    }
}
