package Odev5;
import java.util.Scanner;
public class DaireninAlaniniBulanProgram {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = inp.nextInt();

        System.out.print("Dairenin Merkez Açı Ölçüsünü Giriniz: ");
        a = inp.nextInt();

        alan = (pi * (r*r) * a) / 360;


        System.out.print("Dairenin Alanı: " + alan);




    }
}
