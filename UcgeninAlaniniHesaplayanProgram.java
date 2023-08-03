package Odev3;

import java.util.Scanner;
public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {

        // Değişkenlerimizi tanımlarız.
    int a, b, c;
    double u, alan;

    // Kullanıcı verilerini alırız.
    Scanner inp = new Scanner(System.in);
        System.out.print("1.Kenar Uzunluğunu Giriniz: ");
    a= inp.nextInt();

        System.out.print("2.Kenar Uzunluğunu Giriniz: ");
    b= inp.nextInt();

        System.out.print("3.Kenar Uzunluğunu Giriniz: ");
    c= inp.nextInt();

    // matemetik formülü için kütüphaneden Math sınıfını dahil ederiz.

    u= (a + b + c)  / 2.0;
    alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Kenarları Verilen Üçgenin Alanı : "+alan);




}
}

