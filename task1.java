import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task1 {
     public static void main(String[] args) throws Exception {
        
        int N = 100;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < N; i++) {
            int x = ran.nextInt(N);
            ar.add(x);
        }
        System.out.println("Произвольный список: \n " + ar);

        for (int i = ar.size() - 1; i >= 0; i--) {
            int even = ar.get(i) % 2;
            if (even == 0) {
                // System.out.println("Четное число:" + ar.get(i));
                ar.remove(i);
            }
        }
        Collections.sort(ar);
        System.out.println("Список с удаленными четными числами: \n " + ar);

        int min = ar.get(0);
        int max = ar.get(0);
        float sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            int num = ar.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                 max = num;
            }
            sum += num;
            }
        float average = sum / ar.size();

        System.out.println("Минимальное значение: " + min);

        System.out.println("Максимальное значение: " + max);

        System.out.println("Среднее арифметическое значение: " + average);
        
    }
}
