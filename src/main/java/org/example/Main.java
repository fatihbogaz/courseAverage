package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chem, music, average, total = 0, numberOfLessons = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik dersinin notunu giriniz :");
        math = input.nextInt();
        if (((math <= 100) && (math >= 0))) {
            total += math;
            ++numberOfLessons;
        } else {
            System.out.println("0 ve 100 arasında bir not girmediniz. Bu dersin notu ortalamaya katılmayacaktır.");
        }

        System.out.print("Fizik dersinin notunu giriniz :");
        physics = input.nextInt();
        if (((physics <= 100) && (physics >= 0))) {
            total += physics;
            ++numberOfLessons;
        } else {
            System.out.println("0 ve 100 arasında bir not girmediniz. Bu dersin notu ortalamaya katılmayacaktır.");
        }
        System.out.print("Türkçe dersinin notunu giriniz :");
        turkish = input.nextInt();
        if (((turkish <= 100) && (turkish >= 0))) {
            total += turkish;
            ++numberOfLessons;
        } else {
            System.out.println("0 ve 100 arasında bir not girmediniz. Bu dersin notu ortalamaya katılmayacaktır.");
        }
        System.out.print("Kimya dersinin notunu giriniz :");
        chem = input.nextInt();
        if (((chem <= 100) && (chem >= 0))) {
            total += chem;
            ++numberOfLessons;
        } else {
            System.out.println("0 ve 100 arasında bir not girmediniz. Bu dersin notu ortalamaya katılmayacaktır.");
        }
        System.out.print("Müzik dersinin notunu giriniz :");
        music = input.nextInt();
        if (((music <= 100) && (music >= 0))) {
            total += music;
            ++numberOfLessons;
        } else {
            System.out.println("0 ve 100 arasında bir not girmediniz. Bu dersin notu ortalamaya katılmayacaktır.");
        }
        if (numberOfLessons == 0) {
            System.out.println("Hiçbir dersiniz notu 0 ile 100 arasında değil. Ortalama hesaplanamadı. Tekrardan giriş yapınız.");
        } else {
            average = (total / numberOfLessons);
            if (average >= 55) {
                System.out.println("\nOrtalamanız : " + average + "\nTebrikler, sınıfı geçtiniz.");
            } else
                System.out.println("Ortalamanız : " + average + "\nSınıfı geçemediniz.");
        }
    }
}


