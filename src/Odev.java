// Manav Kasa Programı :

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11 , muz = 0.95 , patl = 5.00, toplam;
        int a, b, c, d, e;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        a = input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        b = input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        c = input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        d = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        e = input.nextInt();

        toplam = (armut * a) + (elma * b) + (domates * c) + (muz * d) + (patl * e);
        System.out.println("Toplam Tutar : " + toplam);

    }
}
