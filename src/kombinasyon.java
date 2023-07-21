import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total1=1,total2=1,nr,total3=1,kombinasyon;
        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        System.out.print("r değerini girin: ");
        int r = input.nextInt();
        nr=n-r;
        for(int i=1;i<=n;i++)
        {
            total1 *=i;
        }

        for(int i=1;i<=r;i++)
        {
            total2 *=i;
        }
        for(int i=1;i<=nr;i++)
        {
            total3 *=i;
        }
        kombinasyon=total1/(total2*total3);
        System.out.println("Sonuç: "+kombinasyon);

    }
}
