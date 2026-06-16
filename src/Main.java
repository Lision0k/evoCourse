import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < 20; i++)
            arr[i] = rand.nextInt(1,16);

        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i = 1; i < 16; i++) {
            for(int num : arr){
                if(num == i)
                    counter++;
            }
            if(counter > 1)
                System.out.printf("Число '%d' встречается %d раз(а)\n", i, counter);
            counter = 0;
        }
    }
}