import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        String username,password,newpassword;
        int secim;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        username=input.nextLine();
        System.out.print("Şifreniz: ");
        password=input.nextLine();

        if(username.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giriş yaptınız");
        }
        else {
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz?\n1.Evet\n2.Hayır ");
            secim=input.nextInt();
            input.nextLine();
            if(secim==1)
            {
                System.out.print(""+"Yeni şifre giriniz:");
                newpassword= input.nextLine();
                if(newpassword.equals("java123"))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }

            }

        }
    }
}
