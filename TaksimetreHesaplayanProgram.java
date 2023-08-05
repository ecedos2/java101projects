package Odev4;
import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {

        int km;
        double perKm= 2.20, total=10;

        Scanner input= new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz: ");
        km =input.nextInt();
        total+= (km*perKm);

        total=(total<20)? 20:total;
        System.out.println("Toplam Tutar: "+ total);


    }
}
