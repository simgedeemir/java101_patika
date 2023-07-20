import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,k=0;
        double sum=0;
        double avg;
        System.out.print("Bir sayı giriniz: ");
        number= input.nextInt();
        for(int i=0;i<=number;i++)
        {
            if(i%3==0 && i%4==0)
            {
                sum+=i;
                k++;
            }


        }
        avg=sum/k;
        System.out.println("Ortalama: "+avg);

    }
}
