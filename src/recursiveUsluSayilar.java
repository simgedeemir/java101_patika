import java.util.Scanner;
public class recursiveUsluSayilar {
    static int usalma(int us,int taban)
    {
        if(us==1)
        {
            return taban;
        }
        return usalma(us-1,taban)* taban;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban= input.nextInt();

        System.out.print("Üs değerini giriniz :");
        int us= input.nextInt();


        int result=usalma(us,taban);
        System.out.println("Result: "+result);

    }
}
