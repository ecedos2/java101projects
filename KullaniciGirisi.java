
import java.util.Scanner;
public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, select, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adı Giriniz :");
        userName = inp.nextLine();

        System.out.println("Kullanıcı Şifresi Giriniz :");
        password = inp.nextLine();

        //tüm bilgilerimiz doğruysa hatasız giriştir.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş İşlemi Başarılı!");
            //tüm bilgiler yanlış olduğu olasılığı.
        } else if (!(userName.equals("patika")) && !(password.equals("java123"))) {
            System.out.println("Kullanıcı Adı ve Şifre Hatalıdır!Lütfen Bilgileri Kontrol Edip Tekrar Deneyiniz. ");
            //kullanıcı adının yanlış olduğu olasılığında.
        } else if (!(userName.equals("patika")) && (password.equals("java123"))) {
            System.out.print("Kullanıcı Adı Hatalıdır! Lütfen Kullanıcı Adınızı Kontrol Edip Tekrar Deneyiniz.");
            //// sadece parolanın yanlış oldugu kombinasyon ve kullanıcıdan parolayı değiştirmek isteyip istemedigini ögreniyoruz ve seçim yaptırıyoruz.
        } else if (userName.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Hatalı Şifre!");
            System.out.println("Şifrenizi Unuttuysanız Adımları Takip Edin\n Yeni Şifre Oluşturmak İçin : 'E' \n Yeni Şifre Oluşturmaktan Vazgeçmek Ve Giriş Ekranından Ayrılmak İçin:'H'");

            System.out.println(" Seçiminiz: ");
            select = inp.nextLine();

            // yaptıgı seçime göre yönlendiriyoruz.

            if (select.equals("E") || select.equals("e")) {
                System.out.println("Yeni Şifre Giriniz .(Lütfen Daha Önceki Şifrelerinizden Farklı Bir Şifre Oluşturunuz):");
                newPassword = inp.nextLine();
                // şifre başarılı şekilde değiştirilirse

                if (!newPassword.equals("java123")) {
                    System.out.print("Yeni Şifreniz Başarı İle Oluşturuldu.");
                    // şifre hatalı şekilde değiştirilmeye çalışılırsa
                } else {
                    System.out.print("Hatalı Deneme! Yeni Şifre Eskisiyle Aynı Olamaz. Tekrar Deneyiniz");
                }
                // kullanınıcı şifreyi degiştirmek istenmezse
            } else if (select.equals("H") || select.equals("h")) {
                System.out.print("Kullanıcı Girişi Sayfasından Ayrılıyorsunuz. İyi Günler.");
                // kullanıcı E ve H dışında hatalı tercih yaparsa
            } else {
                System.out.print("Hatalı Giriş Yaptınız! Lütfen Sadece 'E ve H' Seçeneklerinden Birini Giriniz.");
            }


        }

    }
}
