package Odevler;

import java.util.Scanner;

public class SinifOrtalamasiHesaplama {

        public static void main(String[] args) {

            double mat, fizik, turkce, kimya, muzik, ort;

            Scanner input = new Scanner(System.in);

            System.out.println("Matematik notunuzu giriniz: ");
            mat = input.nextInt();

            System.out.println("Fizik notunuzu giriniz: ");
            fizik = input.nextInt();

            System.out.println("Türkçe notunuzu giriniz: ");
            turkce = input.nextInt();

            System.out.println("Kimya notunuzu giriniz: ");
            kimya = input.nextInt();

            System.out.println("Müzik notunuzu giriniz: ");
            muzik = input.nextInt();

            if (mat<= 100 && mat >= 0 && fizik <= 100 && fizik >= 0 && turkce <= 100 && turkce >= 0 && kimya >= 0 && kimya <= 100 && muzik >= 0 && muzik <= 100) {
                ort= (mat + fizik + turkce + kimya + muzik) / 5;
                System.out.println("Not ortalamanız: " + ort);

                if (ort >= 55) {
                    System.out.println("Sınıfı geçtiniz");
                } else {
                    System.out.println("Sınıfta kaldınız");
                }
            } else {
                System.out.println("Girilen değerler hatalıdır!! Lütfen tekrar deneyiniz.");
            }
        }


    }
