import java.util.Scanner;
public class arrMinMax {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int targetNumber = 5;

        int minClosest = Integer.MIN_VALUE;
        int maxClosest = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < targetNumber && i > minClosest) {
                minClosest = i;
            }
            if (i > targetNumber && i < maxClosest) {
                maxClosest = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxClosest);
    }
}
