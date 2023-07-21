import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz: ");
        number= input.nextInt();

        for(int i=1;i<=number;i*=20)
        {
            System.out.println(i);
        }
    }
}
