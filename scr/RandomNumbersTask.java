import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
public class RandomNumbersTask {
    public static void main(String[] args) {
        int [] array = new int[10];
        int digit = 0;
        while(digit<array.length){
            array[digit++] = ThreadLocalRandom.current().nextInt(100);
        }
        System.out.println(Arrays.toString(array));
//        for(int i = 0; i <array.length;i++)
//            System.out.println(array.);

    }
}
