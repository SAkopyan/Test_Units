package Spam_filter;

/**
 * Created by SAkopyan on 01.11.16.
 */
public class DemoTextAnalayzer {
    public static void main(String[] args) {

        // Входная строка для анализа:
        String commnet = "Это строка содержит полезную информацию :)";
        System.out.println("Проверяемая строка: " + commnet);

        // Создание трех фильтров с параметрами фильтрации:
        SpamAnalyzer filter1 = new SpamAnalyzer(new String[]{"спам","spam","СПАМ"});
        NegativeTextAnalyzer filter2 = new NegativeTextAnalyzer();
        TooLongTextAnalyzer filter3 = new TooLongTextAnalyzer(55);

        // Вывод результата фильтрации по каждому фильтру:
        System.out.println("Результат SpamAnalyzer : " + filter1.processText(commnet));
        System.out.println("Результат NegativeTextAnalyzer : " + filter2.processText(commnet));
        System.out.println("Результат TooLongTextAnalyzer : " + filter3.processText(commnet));
    }
}