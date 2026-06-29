import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date = sdf.parse(str);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        //Увеличить дату на 45 дней и вывести на экран
        calendar.add(Calendar.DAY_OF_MONTH, 45);
        date = calendar.getTime();
        System.out.println("Дата после увеличения на 45 дней: " + sdf.format(date));

        //Сдвинуть дату на начало года и вывести на экран
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        System.out.println("Дата после сдвига на начало года: " + sdf.format(date));

        //Увеличить дату на 10 рабочих дней (считаем субботы и воскресенья выходными) и вывести на экран
        date = sdf.parse(str);
        calendar.setTime(date);
        int day, count = 0;
        while(count<10){
            day = calendar.get(Calendar.DAY_OF_WEEK);
            if(!(day == 6 || day == 7))
                count++;
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        date = calendar.getTime();
        System.out.println("Дата после увеличения на 10 рабочих дней: " + sdf.format(date));

        // Ввести с консоли вторую дату в том же формате и сохранить ее в другой переменной класса Date
        date = sdf.parse(str);
        calendar.setTime(date);
        System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
        str = in.nextLine();
        Date date2 = sdf.parse(str);

        //Посчитать количество рабочих дней (субботы и воскресенья - выходные) между первой и второй датами введенными с консоли и вывести на экран
        count = 0;
        int step;
        if ((calendar.getTime()).compareTo(date2) < 0)
            step = 1;
        else step = -1;
        while(!calendar.getTime().equals(date2)){
            day = calendar.get(Calendar.DAY_OF_WEEK);
            if(!(day == 6 || day == 7))
                count++;
            calendar.add(Calendar.DAY_OF_MONTH, step);
        }
        System.out.println("Количество рабочих дней между введенными датами: " + count);
    }
}