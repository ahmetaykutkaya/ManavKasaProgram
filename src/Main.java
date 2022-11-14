import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner veri = new Scanner(System.in);
        double armut = 2.14,elma = 3.67,domat = 1.11,muz = 0.95,patlican = 5.00;
        double toplam ;

        System.out.print("Armut kac kilo ? : ");
        double a  = veri.nextDouble();
        a *= armut;
        System.out.print("Elma kac kilo ? :");
        double e = veri.nextDouble();
        e *= elma;
        System.out.print("Domates kac kilo ? : ");
        double d =veri.nextDouble();
        d *= domat;
        System.out.print("Muz kac kilo ? : ");
        double m =veri.nextDouble();
        m *= muz;
        System.out.print("Patlican kac kilo ? : ");
        double p =veri.nextDouble();
        p *= patlican;

        toplam = (a+e+d+m+p);

        System.out.print("Toplam tutar : "+ toplam);






    }
}