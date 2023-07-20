import java.util.Scanner;
public class artikyil {

    public static void main(String[] args) {
        int yil,kalan;
        Scanner input=new Scanner(System.in);

        System.out.println("Yıl Giriniz :");
        yil=input.nextInt();

        kalan=yil%4;

        if(kalan==0)
        {
            System.out.println(yil+" bir artık yıldır !");
        }
        else {
            System.out.println(yil+" bir artık yıl değildir !");
        }

    }
}
