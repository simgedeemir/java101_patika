import java.util.Scanner;
public class basamaksayilaritoplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=0;
        System.out.print("Sayı giriniz: ");
        int number=input.nextInt();

        while(number!=0){
            total +=(number%10);
            number =number/10;
        }
        System.out.println("Basamakların toplamı: "+total);

    }
}
