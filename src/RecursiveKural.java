import java.util.Scanner;
public class RecursiveKural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int number = input.nextInt();
        pattern(number, false, number);
    }
    public static int pattern(int number, boolean increase, int numberStorage) {
        int variable;
        if (number > numberStorage && increase) {
            return 1;
        }
        if (number <= 0) {
            increase = true;
        }
        if (increase) {
            variable = 5;
        } else {
            variable = -5;
        }
        System.out.print(number + " ");
        return pattern(number+variable, increase, numberStorage);
    }
}