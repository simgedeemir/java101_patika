import java.util.Scanner;
public class sinifigecmedurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        int derssayisi=0;
        int toplamnot=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik=input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce=input.nextInt();

        System.out.print("Müzik notunuz:");
        muzik=input.nextInt();
        if(mat>=0 && mat<=100)
        {
            derssayisi++;
            toplamnot+=mat;
        }
        if(fizik>=0 && fizik<=100)
        {
            derssayisi++;
            toplamnot+=fizik;
        }
        if(kimya>=0 && kimya<=100)
        {
            derssayisi++;
            toplamnot+=kimya;
        }
        if(turkce>=0 && turkce<=100)
        {
            derssayisi++;
            toplamnot+=turkce;
        }
        if(muzik>=0 && muzik<=100)
        {
            derssayisi++;
            toplamnot+=muzik;
        }

        double avg=toplamnot/derssayisi;

        if(avg<=55){
            System.out.println("Sinifta kaldiniz.");
        }
        else{
            System.out.println("Sinifi gectiniz.");
        }
        System.out.println("Ortalamanız:"+avg);
    }
}
