import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0, b=0, c=0;
        try {
            System.out.print("Введите целое число a: ");
            a = in.nextInt();
            System.out.print("Введите целое число b: ");
            b = in.nextInt();
            System.out.print("Введите целое число c: ");
            c = in.nextInt();

            if (a % 5 == 0 || b % 5 == 0 || c % 5 == 0) {
                if (a % 5 == 0)
                    System.out.println("a=" + a);
                if (b % 5 == 0)
                    System.out.println("b=" + b);
                if (c % 5 == 0)
                    System.out.println("c=" + c);
            } else
                System.out.println("Нет значений, кратных 5");

            System.out.println("(целочисленное) a / b = " + a/b);

            System.out.println("a / b = " + (double) a / b);

            System.out.println((int) Math.ceil((double) a / b));

            System.out.println((int) Math.floor((double) a / b));

            System.out.println(Math.round((double) a / b));

            System.out.println("b % c = " + b % c);

            System.out.println(Math.min(a, b));

            System.out.println(Math.max(b, c));

        }
        catch(Exception e) {
            System.err.print(e);
        }
    }
}