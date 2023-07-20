import java.util.Scanner;
public class Ucakbileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe;
        int yas;
        int secim;

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2");
        secim = input.nextInt();

        double normaltutar, yasindirimi, indirimlitutar = 0, gidisdonusbiletind, toplamtutar;
        if (mesafe > 0) {
            if (secim == 1) {
                normaltutar = mesafe * 0.10;
                if (yas < 12) {
                    yasindirimi = normaltutar * 0.5;
                    indirimlitutar = normaltutar - yasindirimi;
                } else if (yas >= 12 && yas <= 24) {
                    yasindirimi = normaltutar * 0.1;
                    indirimlitutar = normaltutar - yasindirimi;
                } else if (yas >= 65) {
                    yasindirimi = normaltutar * 0.3;
                    indirimlitutar = normaltutar - yasindirimi;
                }
                System.out.println("Toplam Tutar" + indirimlitutar);

            } else if (secim == 2) {
                normaltutar = mesafe * 0.10;
                if (yas < 12) {
                    yasindirimi = normaltutar * 0.5;
                    indirimlitutar = normaltutar - yasindirimi;

                } else if (yas >= 12 && yas <= 24) {
                    yasindirimi = normaltutar * 0.1;
                    indirimlitutar = normaltutar - yasindirimi;
                } else if (yas >= 65) {
                    yasindirimi = normaltutar * 0.3;
                    indirimlitutar = normaltutar - yasindirimi;
                }
                gidisdonusbiletind = indirimlitutar * 0.2;
                toplamtutar = (indirimlitutar - gidisdonusbiletind) * 2;

                System.out.println("Toplam Tutar" + toplamtutar);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
