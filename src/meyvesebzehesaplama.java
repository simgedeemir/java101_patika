import java.util.Scanner;
public class meyvesebzehesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meyveler ve KG Fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan meyve miktarlarını al
        System.out.print("Armut Kaç Kilo? : ");
        int armutKilo = scanner.nextInt();

        System.out.print("Elma Kaç Kilo? : ");
        int elmaKilo = scanner.nextInt();

        System.out.print("Domates Kaç Kilo? : ");
        int domatesKilo = scanner.nextInt();

        System.out.print("Muz Kaç Kilo? : ");
        int muzKilo = scanner.nextInt();

        System.out.print("Patlıcan Kaç Kilo? : ");
        int patlicanKilo = scanner.nextInt();

        // Toplam tutarı hesapla
        double toplamTutar = (armutFiyat * armutKilo) +
                (elmaFiyat * elmaKilo) +
                (domatesFiyat * domatesKilo) +
                (muzFiyat * muzKilo) +
                (patlicanFiyat * patlicanKilo);

        // Sonucu ekrana yazdır
        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");
    }
}
