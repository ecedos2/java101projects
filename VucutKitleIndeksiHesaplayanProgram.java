package Odev6;
import java.util.Scanner;
public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {

        double kg, m, indeks;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg=input.nextDouble();

        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz: ");
        m=input.nextDouble();

        indeks= kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz:"+ indeks);








    }
}
