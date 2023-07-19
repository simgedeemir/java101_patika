import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        r= input.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Dairenin alani:"+alan);
        System.out.println("Dairenin cevresi"+cevre);

    }
}