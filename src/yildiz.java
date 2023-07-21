import java.util.Scanner;
public class yildiz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        String space=" ", star="*";


        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        for(int i=0;i<number;i++){
            System.out.print(space.repeat(number-i));
            System.out.print(star.repeat(i));
            System.out.print("*");
            System.out.println(star.repeat(i));
        }
        for(int j=number-2;j>=0;j--){
            System.out.print(space.repeat(number-j));
            System.out.print(star.repeat(j));
            System.out.print("*");
            System.out.println(star.repeat(j));
        }
    }
}
