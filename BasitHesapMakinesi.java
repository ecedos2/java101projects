package JavaOdevi8;
import java.util.Scanner;
public class BasitHesapMakinesi {
    public static void main(String[] args) {

        double n1,n2;
        int select;

        Scanner input= new Scanner(System.in);


        System.out.print("İlk Sayıyı Giriniz :");
        n1= input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz :");
        n2= input.nextDouble();

        System.out.println("1-Toplama\n 2-Çıkartma\n 3-Çarpma\n 4-Bölme");

        System.out.print("Seçiminizi Giriniz :");
        select= input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama İşlemi Sonucu:" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkartma İşlemi Sonucu:" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma İşlemi Sonucu" + (n1 * n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.print("İşleminizin Sonucu: "+(n1/n2));
                }else {
                    System.out.println("Bir Sayı Sıfıra Bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!");


        }
    }
}

