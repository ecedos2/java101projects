package Odev7;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armKg, elmKg, domKg, muzKg, patKg, toplamTutar;
        double arm=2.14, elm=3.67, dom=1.11, muz=0.95, pat=5.00;

        Scanner input= new Scanner(System.in);

        System.out.print("Armut Kaç Kg:");
        armKg= input.nextDouble();

        System.out.print("Elma Kaç Kg:");
        elmKg=input.nextDouble();

        System.out.print("Domates Kaç Kg:");
        domKg=input.nextDouble();

        System.out.print("Muz Kaç Kg:");
        muzKg=input.nextDouble();

        System.out.print("Patlıcan Kaç Kg:");
        patKg=input.nextDouble();


        toplamTutar=(armKg*arm)+ (elmKg*elm)+(domKg*dom)+ (muzKg*muz)+(patKg*pat);
        System.out.print("Toplam Tutar:"+toplamTutar);


















    }
}
