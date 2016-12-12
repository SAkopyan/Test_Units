package FromStepik;

import java.util.Scanner;

/**
 * Created by SAkopyan on 30.09.16.
 * Program name: PolindromChecker
 * Version: 1.0
 * Description:
 * Задача данной программы заключается в считывании из стандартного ввода предложения и его проверки на полиандромность.
 * В качестве результата выводится сообщение в виде булевого значения True or False.
 */
public class PolindromChecker {
    public static void main(String[] args){
        //---Блок кода реализующий конструкцию (обьект) для считывания ввода из консоли
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение :");
        String text = in.nextLine();
        //---System.out.println(text);

        //---Метод класса String возвращающий количество символов в строке
        int length = text.length();
        //---

        //---Метод replaceAll класса String позволяющий производить замену символов в строке по регулярному выражению
        // (в нашем случае [^a-zA-Z0-9] просто заменяется на "" пусто)
        String text2 = text.replaceAll("[^a-zA-Z0-9]", "");
        //---

        //---Здесь text2 помещается в стрингбилдер для последующего использования метода reverce с целью переворота
        // строки
        StringBuilder formattext = new StringBuilder(text2);
        String text3 = new String(formattext.reverse());

        //Вывод программы:

        System.out.println("Общее количество символов в предложении : " + length + "последний символ это: " + text.charAt(length-1));
        System.out.println("Модифицированная строка :" + text2);
        System.out.println("Обратная модифицированная строка :" + text3);
        System.out.print("Результат проверки строки на полиандромность :" + text2.equalsIgnoreCase(text3));

    }
}
