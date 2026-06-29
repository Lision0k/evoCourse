import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Подсчитать сколько раз подстрока встречается в строке и вывести это значение на экран
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        System.out.print("Введите подстроку: ");
        String sub_str = in.nextLine();
        String[] arr = str.split(sub_str);
        if(str.endsWith(sub_str))
            System.out.printf("Подстрока '%s' встречается %d раз(а)\n\n", sub_str, arr.length);
        else System.out.printf("Подстрока '%s' встречается %d раз(а)\n\n", sub_str, arr.length-1);

        //Заменить в строке все слова "кака" и "бяка" на "вырезано цензурой"
        System.out.println("Введите строку:");
        str = in.nextLine();
        str = str.replaceAll("кака", "вырезано цензурой");
        str = str.replaceAll("бяка", "вырезано цензурой");
        System.out.println(str + "\n");

        //Ввести строку с датой формата: 31.12.2020
        //Преобразовать строку даты в формат: 2020-12-31
        System.out.println("Ведите дату в формате 'дд.мм.гггг'");
        String date = in.nextLine();
        String[] datenums = date.split("\\.");
        System.out.printf("%s-%s-%s\n", datenums[2], datenums[1], datenums[0]);

        //Сделать предыдущее задание с использованием классов Date и SimpleDateFormat и их соответствующих методов
        SimpleDateFormat sdf = new SimpleDateFormat("dd.M.yyyy");
        try {
            Date date1 = sdf.parse(date);
            sdf = new SimpleDateFormat("yyyy-M-dd");
            System.out.println(sdf.format(date1));
        } catch (ParseException e) {
            System.err.println(e);
        }
    }
}