import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String username,password;
        int right=3;
        int balance = 1500;
        int select;
        while(right>0) {
            System.out.print("Kullanıcı Adınız: ");
            username = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev123")){

                do{
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        int depositAmount = input.nextInt();
                        balance += depositAmount;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        int withdrawAmount = input.nextInt();
                        if (withdrawAmount > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= withdrawAmount;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
                        break;
                }
                }while (select != 4);
                break;
            }else{
                --right;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }



    }
}
