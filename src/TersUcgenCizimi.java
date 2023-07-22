import java.util.Scanner;

public class TersUcgenCizimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamakSayisi = scanner.nextInt();

        // Ters üçgeni çizmek için i dış döngüsü
        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları yazdırmak için j iç döngüsü
            for (int j = 1; j <= basamakSayisi - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırmak için k iç döngüsü
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Bir satır atla
        }

    }
}
