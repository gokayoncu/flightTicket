import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        double distance, ticket, discounTicket;
        int age, way;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance = inp.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (Tek yön için 1, Gidiş dönüş için 2): ");
        way = inp.nextInt();
        ticket = distance * 0.10;
        if ((age > 0) && (distance > 0)) {
            if (age < 12) {
                discounTicket = ticket - (ticket * 0.5);
                switch (way) {
                    case 1:
                        System.out.println("Bilet ücretiniz: " + discounTicket);
                        break;
                    case 2:
                        System.out.println("Bilet ücretiniz: " + (discounTicket - (discounTicket * 0.2)));
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız!");
                }
            } else if ((age >= 12) && (age <= 24)) {
                discounTicket = ticket - (ticket * 0.1);
                switch (way) {
                    case 1:
                        System.out.println("Bilet ücretiniz: " + discounTicket);
                        break;
                    case 2:
                        System.out.println("Bilet ücretiniz: " + 2 * (discounTicket - (discounTicket * 0.2)));
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız!");
                }
            } else if (age > 65) {
                discounTicket = ticket - (ticket * 0.3);
                switch (way) {
                    case 1:
                        System.out.println("Bilet ücretiniz: " + discounTicket);
                        break;
                    case 2:
                        System.out.println("Bilet ücretiniz: " + 2*(discounTicket - (discounTicket * 0.2)));
                    default:
                        System.out.println("Hatalı giriş yaptınız!");
                }
            } else {
                System.out.println("Bilet ücretiniz: " + ticket);
            }
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }


    }
}
