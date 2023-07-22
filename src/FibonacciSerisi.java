import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println("Fibonacci serisi:");

        int prev = 0;
        int curr = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(prev + " ");

            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        scanner.close();
    }
}
