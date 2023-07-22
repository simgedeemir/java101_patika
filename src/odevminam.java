import java.util.Scanner;
public class odevminam {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n= input.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+". Sayıyı giriniz: ");
            a[i]=input.nextInt();
        }
        int enBuyuk = a[0];
        int enKucuk = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > enBuyuk) {
                enBuyuk = a[i];
            }

            if (a[i] < enKucuk) {
                enKucuk = a[i];
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
