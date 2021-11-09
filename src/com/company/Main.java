package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        if (mat<0 || mat>100){
            System.out.println("Notunuz 0 ile 100 arasında olmalıdır ");
            return;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("Notunuz 0 ile 100 arasında olmalıdır ");
            return;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("Notunuz 0 ile 100 arasında olmalıdır ");
            return;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("Notunuz 0 ile 100 arasında olmalıdır ");
            return;
        }

        System.out.print("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("Notunuz 0 ile 100 arasında olmalıdır ");
            return;
        }

        double ort = ((mat + fizik + turkce + kimya + muzik)/5);
        if (ort <= 55){
            System.out.println("Sınıfta kaldınız");
        }else {
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        System.out.print("Ortalamanız:" +ort);

    }
}
