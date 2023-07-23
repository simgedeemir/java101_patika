import java.util.Scanner;

public class AsalSayiRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALdır!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }

    // Recursive olarak asal sayı kontrolü
    public static boolean isAsal(int sayi, int i) {
        if (sayi <= 2) {
            return (sayi == 2);
        }
        if (sayi % i == 0) {
            return false;
        }
        if (i * i > sayi) {
            return true;
        }
        return isAsal(sayi, i + 1);
    }
}
